package sudoku;
import java.util.*;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class Grid {
    //declare contstants (used in percentCompletion function
    //static final int TOTAL_CELLS = 81;
    //static final int ROWS = 9;
    //static final int COLS = 9;
    //static final int REGIONS = 27;
    
    //declare variables and arrays
    //int rows, cols;
    private int[][] solution;
    private int[][] game;  //generate game array
    //private int[][] gamePositions = new int[ROWS][COLS];
    
    //declare variables for percentCompletion function
    //double startingCells, correctCells, incorrectCells;
    //int modifiedCells = 4; //this is only temporary
    //double percentComplete;
    
    //constructor    
    public Grid(){
        
    }
    
    public void newGame() {
        //game(ROWS,COLS) //not needed at this time
        //create a valid puzzle solution
        //call method and pass new array and index = 0
        solution = createSolution(new int[9][9], 0); 
        
    }
    
    private int[][] createSolution(int[][] game, int index) { //requires 2d array and index to be passed into
        //if (index > 80) 
        //    return game; //return a successfully created game and exit method
        
        //int x = index / 9; //index should not go beyond 8
        //int y = index / 9; //index should not go beyond 8
        
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
        
        //List<Integer> numbers = new ArrayList<Integer>(); //create a new List of integers
        //loop through numbers 1 - 9 and add them to the List
        //for (int i = 1; i <= 9; i++)
        //    numbers.add(i);
       
        //shuffle the list of numbers
        //Collections.shuffle(numbers);
        
        //print the numbers list
        //for (int n : numbers)
        //    System.out.println(numbers);
        
        //loop through numbers and add them to game array
        //while (numbers.size() > 0) {
            //check if num exists in row
            //insert method to check if number is valid in row

            //check if num exists in column
            //insert method to check if number is valid in column

            //check if num exists in 3x3 block
            //insert method to check if number is valid in 3x3 block             
        //}
        return null;
    }
    
    private boolean isValidRow(int[][] game, int y, int number) {
        for (int x = 0; x < 9; x++) {
            if (game[y][x] == number)
                return false;
        }
        return true;
    }
    
    private boolean isValidColumn(int[][] game, int x, int number) {
        for (int y = 0; y < 9; y++) {
            if (game[y][x] == number)
                return false;
        }
        return true;
    }
    
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
