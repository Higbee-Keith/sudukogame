package byui.cit260.sudoku.views;
import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class GetGridView {

    //default constructor
    public GetGridView() {
        
    }
    
    public Point getInputLocation() {
        Scanner input = new Scanner(System.in);
        String[] location; //String array needed to hold the two values
        Point gridLocation = null; //Point array needed to return the grid location
        boolean validLocation = false;
        
        //prompt for the location
        while (!validLocation) {
            System.out.print("\t Enter a row and column number (Ex: 1 4)");
            
            //get the input values
            String strInputRowColumn = input.nextLine();
            //remove excess spaces from end of input
            strInputRowColumn = strInputRowColumn.trim();
            //if necessary, replace commas with spaces
            strInputRowColumn = strInputRowColumn.replace(',', ' ');
            //put a space between the chars
            location = strInputRowColumn.split("\\s");
            
            //test if two numbers have been entered
            if (location.length < 1 || location.length > 2) {
                System.out.println("Two numbers must be entered:  \n"
                        + "one for the row, one for the column");
                continue; //restart loop
            }
            
            int row = Integer.parseInt(location[0]);
            int column = Integer.parseInt(location[1]);
            
            //test if numbers entered are valid (1-9) for the rows and columns
            if (row < 1 || row > 9 || column < 1 || column > 9) {
                System.out.println("You've entered an invalid row or column number.");
                continue;  //restart loop
            }
            
            //Point array needed to hold the return value
            gridLocation = new Point(row, column);
            
            //check if location in grid contains a previous answer
            System.out.println("Grid has not yet been finalized.\n"
                + "Answer locations will be checked after grid is complete.");
            
            validLocation = true;
        }
        return gridLocation;
    }
}
