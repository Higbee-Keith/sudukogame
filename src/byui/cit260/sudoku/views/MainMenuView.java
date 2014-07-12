package byui.cit260.sudoku.views;

import byui.cit260.sudoku.controls.MainMenuControl;
import byui.cit260.sudoku.enums.StatusType;
import byui.cit260.sudoku.exceptions.MenuException;
import byui.cit260.sudoku.interfaces.EnterInfo;
import byui.cit260.sudoku.models.Game;
import byui.cit260.sudoku.models.Menu;
import java.util.Scanner;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class MainMenuView extends Menu implements EnterInfo {
    //constructor
    public MainMenuView() {
        super(MainMenuView.menuItems);
    }
    
    //create an array of Strings for the help menu items 
    private final static String[][] menuItems = {
        {"N", "New Game"},
        {"O", "Player Options"},
        {"P", "Preferences"},
        {"H", "Help"},
        {"X", "Exit Game"}
    };
    
    //create instance of MainMenuControl
    private MainMenuControl mainMenuControl = new MainMenuControl();
    
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
                    case "X":
                        return StatusType.EXIT; 
                }
            }
            catch (MenuException ex) {
                //Prints out proper error message from Menu class...
                //error text is in Error enum class
                System.out.println("\n" + ex.getMessage());
            } 
        } while (!status.equals("EXIT"));
        return StatusType.EXIT;
    }
}
