package sudoku;
import java.util.Scanner;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class GamePreferencesView {

    //create an array of Strings for the help menu items
    private final static String[][] preferencesMenuItems = {
        {"B", "Display game board"},
        {"D", "Game difficulty"},
        {"R", "Return to main menu"}
    };
    
    //create instance of GamePreferencesControl
    private GamePreferencesControl gamePreferencesControl = new GamePreferencesControl();
    
    //default constructor
    public GamePreferencesView() {
        
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
                case "B":
                    this.gamePreferencesControl.displayGameBorder();
                    break;
                case "D":
                    this.gamePreferencesControl.displayGameDifficulty();
                    break;
                case "R":
                    this.gamePreferencesControl.displayReturnToMainMenu();
                    break;
                default:
                    System.out.println("Please enter a valid command");
                    continue;                    
            } 
        } while (!input.equals("R"));
        return;
    }
    
    //displays the help menu
    public void display() {
        System.out.println("\n**************************************************\n");
        //for loop to cycle through array of menu items
        System.out.println("\t\tGame Preferences Menu\n");
        for (int i = 0; i < GamePreferencesView.preferencesMenuItems.length; i++) {
            System.out.println("\t " + preferencesMenuItems[i][0] + "\t" + preferencesMenuItems[i][1]);
        }
        System.out.println("\n**************************************************");
    }
}
