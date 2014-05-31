package sudoku;
import java.util.*; //Reads input from System.in

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class Grid {
    //declare contstants (used in percentCompletion function
    static final int TOTAL_CELLS = 81;
    static final int ROWS = 9;
    static final int COLS = 9;
    static final int REGIONS = 27;
    
    //declare variables and arrays
    int rows, cols;
    private int[][] game;  //generate game array
    private int[][] gamePositions = new int[ROWS][COLS];
    
    //declare variables for percentCompletion function
    //double startingCells, correctCells, incorrectCells;
    //int modifiedCells = 4; //this is only temporary
    //double percentComplete;
    
    //constructor    
    public Grid(){
        
    }
    
    public void newGame() {
        game(ROWS,COLS);
        
    }
    
    public void game(int r, int c) {
        rows = r;
        cols = c;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
            {
                //currently uses numbers 0 - 9
                //and does not check for duplicates
                //gamePositions[i][j] = (int)(10*Math.random());
                gamePositions[i][j] = (int)(10*Math.random());
                System.out.print(gamePositions[i][j] + " ");
            }
            System.out.println();
        }
    }

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
    }
        
    public double percentCompletion() {
        startingCells = givenNumbers;
        
        correctCells = startingCells + modifiedCells;
        incorrectCells = TOTAL_CELLS - correctCells;

        percentComplete = (correctCells / TOTAL_CELLS) * 100;
        
        percentComplete = (int) percentComplete; //cast a double to an int
        
        System.out.println("\nYou have " + correctCells + " correct cells and "
                            + incorrectCells + " incorrect cells.\nThe game is "
                            + percentComplete + "% complete.");
        return percentComplete;
    }*/
}
