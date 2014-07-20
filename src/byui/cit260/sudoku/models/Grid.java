package byui.cit260.sudoku.models;
import byui.cit260.sudoku.frames.GameDifficultyFrame;
import java.io.Serializable;
import static java.lang.Math.random;
import java.util.*;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class Grid implements Serializable {
    //declare constants
    static final int TOTAL_CELLS = 81;

    //declare variables and arrays
    private int[][] solution;
    private int[][] tempGame;
    private Integer[][] game = new Integer[9][9];  //generate game array
    private Solution newSolution = new Solution();
    //List<Integer> gameCells = new ArrayList<Integer>();
    
    //constructor    
    public Grid(){        
    }

    public int[][] getSolution() {
        return solution;
    }

    public void setSolution(int[][] solution) {
        this.solution = solution;
    }

    public int[][] getTempGame() {
        return tempGame;
    }

    public void setTempGame(int[][] tempGame) {
        this.tempGame = tempGame;
    }

    public Integer[][] getGame() {
        return game;
    }

    public void setGame(Integer[][] game) {
        this.game = game;
    }

    //public List<Integer> getGameCells() {
    //    return gameCells;
    //}

    //public void setGameCells(List<Integer> gameCells) {
    //    this.gameCells = gameCells;
    //}
    
    public void newGame() {        
        //create a valid puzzle solution using setter method
        //call Solution class.createSolution method and pass new array and index = 0
        setSolution(newSolution.createSolution(new int[9][9], 0));
        
        //tempGame = newSolution.copySolution(solution);
        //create a copy of the solution and assign to tempGame
        setTempGame(getSolution());
        
        //displays the tempGame (copy of solution)
        //FOR DEBUGGING PURPOSES ONLY
        //print the copied solution to the screen
        //for (int j = 0; j < tempGame.length; j++) {
        //        for (int k = 0; k < tempGame[j].length; k++) {
        //            System.out.print(tempGame[j][k] + " ");
        //        }
        //        System.out.println();
        //    }
        //System.out.println();
        //*/
        
        //get difficulty - not currently working
        //GameDifficultyFrame gameDifficulty = new GameDifficultyFrame();
        //int dif = gameDifficulty.diff;
        
        //temporary difficultyLevel
        Random rand = new Random();
        int d = rand.nextInt((65 - 35) +1) + 35; //get random value in range of 35 - 65
        createGame(getTempGame(), d);
        //setGame(game);
    }
    
    //createGame method -- new
    public Integer[][] createGame(int[][] tmpGame, int difficulty) {
        Random rand = new Random();
        convertGame(tmpGame);
        for(int i = 0; i < difficulty; i++){   
            int iRand = rand.nextInt(9); //get random number up to 9
            int jRand = rand.nextInt(9); //get random number up to 9
            if (game[iRand][jRand] == null)
                i--; //location already null.  decrement i and start over
            else
                game[iRand][jRand] = null;
        }
        setGame(game); 
        //displays the tmpGame (tempGame with zeroes)
        //FOR DEBUGGING PURPOSES ONLY
        //print the game to the screen
        //System.out.println("This is a copy of the solution with zeroes "
        //        + "replacing random elements");
        //for (int j = 0; j < tmpGame.length; j++) {
        //        for (int k = 0; k < tmpGame[j].length; k++) {
        //            System.out.print(tmpGame[j][k] + " ");
        //        }
        //        System.out.println();
        //    }
        //System.out.println();
        return game;
    }
 
    private Integer[][] convertGame(int[][] tmpGame) {
        // convert int[] to Integer[]
        for(int i = 0; i < tmpGame.length; i++) {
            for (int j = 0; j < tmpGame[i].length; j++) {
                game[j][i] = tmpGame[j][i];
            }
        }
        return game;
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
}
