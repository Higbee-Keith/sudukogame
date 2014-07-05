package byui.cit260.sudoku.views;
import java.util.Scanner;
import byui.cit260.sudoku.models.Game;
import byui.cit260.sudoku.controls.MainMenuControl;
import byui.cit260.sudoku.models.Menu;
import byui.cit260.sudoku.interfaces.EnterInfo;

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
        {"Q", "QUIT"}
    };
    
    //create instance of MainMenuControl
    private MainMenuControl mainMenuControl = new MainMenuControl();
    
    //call the display method and get user input
    @Override
    public String getInput(Object object) {
        String status = Game.PLAYING;    
        do {
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
                case "Q":
                    System.exit(0);                  
            } 
        } while (!status.equals(Game.EXIT));
        return Game.EXIT;
    }
}
