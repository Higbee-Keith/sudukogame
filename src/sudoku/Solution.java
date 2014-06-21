package sudoku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class Solution {

    public Solution() {
    }
    
    public int[][] createSolution(int[][] game, int index) { //requires 2d array and index to be passed into
        if (index > 80) {
            for (int j = 0; j < game.length; j++) {
                for (int k = 0; k < game[j].length; k++) {
                    System.out.print(game[j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return game; //return a successfully created game and exit method
        }
        
        //declare variables
        int x = index % 9; //remainder is used to move to next gamecell
        int y = index / 9; //index should not go beyond 8
        int i = 1;
        
        List<Integer> listOfNumbers = new ArrayList<Integer>(); //create a new List of integers
        //loop through numbers 1 - 9 and add them to the List
        while (i <= 9) {
            listOfNumbers.add(i);
            i++;
        }
        
        //shuffle the list of numbers
        Collections.shuffle(listOfNumbers);
        
        //loop through numbers and add them to game array
        while (listOfNumbers.size() > 0) {
            int num = getNextValidNumber(game, x, y, listOfNumbers);
            if (num == -1)
                //return null value because no valid number was returned from getNextValidNumber function
                return null; 
            
            game[y][x] = num; //assign valid number to game array
            
            //rerun this method using tmpArray[][] to continue build out game array
            //increase the index by 1
           int[][] tmpArray = createSolution(game, index + 1);
           
           //return tmpArray if it contains a value
           if (tmpArray != null)
               return tmpArray;
           
           game[y][x] = 0;
        }
        return null; //should not be reached, but this is required for function
    }
    
    private int getNextValidNumber(int[][] game, int x, int y, List<Integer> listOfNumbers) {
        while (listOfNumbers.size() > 0) {
            //remove the first element from the list and assign to variable
            int num = listOfNumbers.remove(0);
            
            //check if num exists in row, column, and 3x3 block
            //return the num if it does not exist
            if (isValidRow(game, y, num) && isValidColumn(game, x, num) && isValidBlock(game, x, y, num))
                return num;
        }
        return -1;
    }
        
    private boolean isValidRow(int[][] game, int y, int testNumber) {
        int x = 0;
        while (x < 9) {
            if (game[y][x] == testNumber)
                return false;  //testNumber already exists in row
            x++;
        }
        return true; //textNumber does not exist in row
    }
    
    private boolean isValidColumn(int[][] game, int x, int testNumber) {
        int y = 0;
        while (y < 9) {
            if (game[y][x] == testNumber)
                return false; //testNumber already exists in column
            y++;
        }
        return true; //testNumber does not exist in column
    }
    
    private boolean isValidBlock(int[][] game, int x, int y, int testNumber) {
        //declare variables referencing 3x3 block location in 9x9 grid
        int blockX, blockY;
        
        //determine row of 3x3 block being tested
        if (x < 3) 
            blockX = 0; //rows 0, 1, 2
        else if (x < 6)
            blockX = 3; //rows 3, 4, 5
        else
            blockX = 6; //rows 6, 7, 8
        
        //determine column of 3x3 block being tested
        if (y < 3)
            blockY = 0; //columns 0, 1, 2
        else if (y < 6)
            blockY = 3; //columns 3, 4, 5
        else
            blockY = 6; //columns 6, 7, 8
        
        while (y < blockY + 3) {
            while (x < blockX + 3) {
                if (game[blockY][blockX] == testNumber) 
                    return false; //testNumber exists in 3x3 block
                x++;
            }
            y++;
        }
        return true; //testNumber does not exist in 3x3 block
        
    }
    
    public int[][] copySolution(int[][] game) {
        int y = 0;
        int[][] validGame = new int[9][9];
        while ( y < 9 ) {
            int x = 0;
            while (x < 9 ) {
                validGame[y][x] = game[y][x];
                x++;
            }
            y++;
        }
        
        //print the copied solution to the screen
        for (int j = 0; j < validGame.length; j++) {
                for (int k = 0; k < validGame[j].length; k++) {
                    System.out.print(validGame[j][k] + " ");
                }
                System.out.println();
            }
        System.out.println();
            
        return validGame;
    }
    
}
