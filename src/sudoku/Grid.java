package sudoku;
import java.util.Scanner; //Reads input from System.in

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class Grid {
    //declare variables
    int givenNumbers;
        
    //declare contstants (used in percentCompletion function
    static final int TOTAL_CELLS = 81;
    
    //declare variables for percentCompletion function
    double startingCells, correctCells, incorrectCells;
    int modifiedCells = 4; //this is only temporary
    double percentComplete;
      
        
    public Grid(){
    }
    
    private int getInitialGridNumbers() {
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
    }
}
