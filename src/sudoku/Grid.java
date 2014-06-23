package sudoku;
import java.util.*;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class Grid {
    //declare constants
    static final int TOTAL_CELLS = 81;

    //declare variables and arrays
    private int[][] solution;
    private int[][] tempGame;
    private int[][] game;  //generate game array
    private Solution newSolution = new Solution();
    List<Integer> gameCells = new ArrayList<Integer>();
    
    //constructor    
    public Grid(){        
    }
    
    public void newGame() {
        //game(ROWS,COLS) //not needed at this time
        //arrayShuffle();
        
        //create a valid puzzle solution
        //call Solution class.createSolution method and pass new array and index = 0
        solution = newSolution.createSolution(new int[9][9], 0);
        
        //call Solution class.copySolution method and pass valid solution
        tempGame = newSolution.copySolution(solution);
        
        //call createGame
        //game = createGame(tempGame, gameCells);  
    }
    
    //createGame method not yet fully functional
    private int[][] createGame(int[][] game, List<Integer> gameCells) {
        int i = 0;
        /*while (gameCells.size() > 0) {
            int gamePosition = gameCells.remove(0);
            int x = gamePosition % 9;
            int y = gamePosition / 9;
            int tempGame = game[y][x];
            game[y][x] = 0;
            
            if (!)
        }*/
        
        gameCells = new ArrayList<Integer>();
        while (i < TOTAL_CELLS) {
            gameCells.add(i);
            i++;
        }
        Collections.shuffle(gameCells);
        return createGame(game, gameCells);
        
        //return game;
    }
    
    /*private void arrayShuffle() {
        //create new Integer array
        Integer[] numbers = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        //Shuffle integer array
        Collections.shuffle(Arrays.asList(numbers));
        
        System.out.print("Array looks like this = ");
        //for-each loop to print out elements in the numbers array
        for (int num : numbers) {
            System.out.print(num + ", ");
        }
        System.out.println(); //line break
        
        //for-each loop to print out elements in the numbers array
        for (int num : numbers) {
            int indexOfNum = Arrays.asList(numbers).indexOf(num);
            System.out.println("Index " + indexOfNum + " contains: " + num); 
        }
    }*/
    
    /*public void game(int r, int c) {
        rows = r;
        cols = c;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
            {
                //currently uses numbers 0 - 9
                //and does not check for duplicates
                gamePositions[i][j] = (int)(10*Math.random());
                System.out.print(gamePositions[i][j] + " ");
            }
            System.out.println();
        }
    }*/
    
    /*private int getInitialGridNumbers() {
        //Declare a new Scanner input
        Scanner input = new Scanner(System.in);
        
        //Get number from user and return the value
        System.out.println("How many numbers would you like to start with?");
        return givenNumbers = input.nextInt();              
    }
    
    public void displaySize() {
        getInitialGridNumbers();
        System.out.println("Your game will start with " + givenNumbers + 
                " numbers already completed for you.");
    }*/
}
