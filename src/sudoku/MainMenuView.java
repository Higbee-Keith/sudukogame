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
public class MainMenuView {

    //create an array of Strings for the help menu items 
   private final static String[][] mainMenuItems = {
        {"N", "New Game"},
        {"O", "Player Options"},
        {"P", "Preferences"},
        {"H", "Help"},
        {"Q", "QUIT"}
    };
    
    //create instance of HelpMenuControl
    private MainMenuControl mainMenuControl = new MainMenuControl();
    
    //default constructor
    public MainMenuView() {
        
    }
    
    //call the display method and get user input
    public void getInput() {
        String input;
        Scanner getCommand = new Scanner(System.in);
        
        do {
            this.display(); //displays the display method from this class
            
            //get the input command entered by user
            System.out.println("\nPlease enter a valid command");
            input = getCommand.nextLine();
            input = input.trim().toUpperCase();  //forces input to validate to uppercase
            
            switch (input) {
                case "N":
                    this.mainMenuControl.displayNewGame();
                    break;
                case "O":
                    this.mainMenuControl.displayPlayerOptions();
                    break;
                case "P":
                    this.mainMenuControl.displayGamePreferences();
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();
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
    
    //displays the main menu
    public void display() {
        System.out.println("\n**************************************************\n");
        //for loop to cycle through array of menu items
        System.out.println("\t\tMain Menu\n");
        for (int i = 0; i < MainMenuView.mainMenuItems.length; i++) {
            System.out.println("\t " + mainMenuItems[i][0] + "\t" + mainMenuItems[i][1]);
        }
        System.out.println("\n**************************************************");
    }
}
