package sudoku;
import java.util.Scanner;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
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
