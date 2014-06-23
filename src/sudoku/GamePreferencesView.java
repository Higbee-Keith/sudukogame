package sudoku;
import java.util.Scanner;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class GamePreferencesView extends Menu{    
    //constructor
    public GamePreferencesView() {
        super(GamePreferencesView.menuItems);
    }
    
    //create an array of Strings for the help menu items
    private final static String[][] menuItems = {
        {"B", "Display game board"},
        {"D", "Game difficulty"},
        {"R", "Return to main menu"}
    };
    
    //create instance of GamePreferencesControl
    private GamePreferencesControl gamePreferencesControl = new GamePreferencesControl();
    
    //call the display method and get user input
    @Override
    public String executeCommands(Object object) {
        String input;
        do {
            this.display(); //displays the display method from this class
            
            //get the input command entered by user
            input = this.getCommand();
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
        return input;
    }
}
