package byui.cit260.sudoku.views;
import java.util.Scanner;
import byui.cit260.sudoku.controls.GamePreferencesControl;
import byui.cit260.sudoku.enums.StatusType;
import byui.cit260.sudoku.exceptions.MenuException;
import byui.cit260.sudoku.models.Menu;
import byui.cit260.sudoku.interfaces.EnterInfo;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class GamePreferencesView extends Menu implements EnterInfo {    
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
    public StatusType getInput(Object object) {
        StatusType status = StatusType.PLAYING;
        do {
            try {
                this.display(); //displays the display method from this class

                //get the input command entered by user
                String input = this.getCommand();
                switch (input) {
                    case "B":
                        this.gamePreferencesControl.displayGameBorder();
                        break;
                    case "D":
                        this.gamePreferencesControl.setGameDifficulty();
                        break;
                    case "R":
                        return StatusType.RETURN;
                }
            }
            catch (MenuException ex) {
                //Prints out proper error message from Menu class...
                //error text is in Error enum class
                System.out.println("\n" + ex.getMessage());
            } 
        } while (status != StatusType.RETURN);
        return status;
    }
}
