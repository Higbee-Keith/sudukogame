package byui.cit260.sudoku.views;
import java.util.Scanner;
import byui.cit260.sudoku.models.Menu;
import byui.cit260.sudoku.controls.PlayerMenuControl;
import byui.cit260.sudoku.enums.StatusType;
import byui.cit260.sudoku.exceptions.MenuException;
import byui.cit260.sudoku.interfaces.EnterInfo;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class PlayerMenuView extends Menu implements EnterInfo {
    //constructor
    public PlayerMenuView() {
        super(PlayerMenuView.menuItems);
    }
    
    // create instance of playermenucontrol
    private PlayerMenuControl playerMenuControl = new PlayerMenuControl();
    
    // create an array of strings to act as player menu items
    private final static String [][] menuItems = {
        {"N", "Enter Player's Name"},
        {"R", "Return to Main Menu"}
    };
    
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
                        this.playerMenuControl.setPlayerName();
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