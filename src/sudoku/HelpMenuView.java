package sudoku;
import java.util.Scanner;
/*
Step 2: Create a new class for the “Help” menu and call it HelpMenuView. This
class is responsible for displaying and retrieving the end user's input
selection and is often referred to as the "view" layer.  It must contain:

    *A function to display the help menu,
    *A function to get the player's input selection
    *A function to validate that the selection entered was valid. Use an
    if-else-if ladder or a switch statement to determine if the selection
    is valid. Use a do-while statement to loop until the end user (player) 
    enters a valid selection.

Step 4:  Modify the HelpMenuView class to call the appropriate action
function in the HelpMenuControl class. 
 */

/**
 *
 * @author macpro
 */
public class HelpMenuView {

    //create an array of Strings for the help menu items
    private final static String[][] helpMenuItems = {
        {"B", "Board help"},
        {"N", "Numbers help"},
        {"P", "Player help"},
        {"S", "Statistics help"},
        {"E", "End game help"},
        {"Q", "QUIT"}
    };
    
    //create instance of HelpMenuControl
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    //default constructor
    public HelpMenuView() {
        
    }
    
    //call the display method and get user input
    public void getInput() {
        String input;
        Scanner getCommand = new Scanner(System.in);
        
        do {
            this.display(); //displays the display method from this class
            
            //get the input command entered by user
            input = getCommand.nextLine();
            input = input.trim().toUpperCase();  //to check on later....
            
            switch (input) {
                case "B":
                    this.helpMenuControl.displayBoardHelp();
                    break;
                case "N":
                    this.helpMenuControl.displayNumbersHelp();
                    break;
                case "P":
                    this.helpMenuControl.displayPlayerHelp();
                    break;
                case "S":
                    this.helpMenuControl.displayStatisticsHelp();
                    break;
                case "E":
                    this.helpMenuControl.displayEndGameHelp();
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Please enter a valid command");
                    continue;                    
            } 
        } while (!input.equals("Q"));
        return;
    }
    
    //displays the help menu
    public void display() {
        System.out.println("\n......................................");
        
        //for loop to cycle through array of menu items
        for (int i = 0; i < HelpMenuView.helpMenuItems.length; i++) {
            System.out.println("\t " + helpMenuItems[i][0] + "\t" + helpMenuItems[i][1]);
        }
    }
}
