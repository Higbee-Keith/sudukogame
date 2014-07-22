package byui.cit260.sudoku.views;

import byui.cit260.sudoku.controls.HelpMenuControl;
import byui.cit260.sudoku.enums.StatusType;
import byui.cit260.sudoku.exceptions.MenuException;
import byui.cit260.sudoku.interfaces.EnterInfo;
import byui.cit260.sudoku.models.Menu;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class HelpMenuView extends Menu implements EnterInfo {
    //constructor
    public HelpMenuView() {
        super(HelpMenuView.menuItems);
    }

    //create an array of Strings for the help menu items
    private final static String[][] menuItems = {
        {"B", "Board help"},
        {"N", "Numbers help"},
        {"P", "Player help"},
        {"S", "Statistics help"},
        {"E", "End game help"},
        {"R", "Return to main menu"}
    };
    
    //create instance of HelpMenuControl
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    //call the display method and get user input
    @Override
    public StatusType getInput(Object object) { //was called getCommand before implementing interfaces
        StatusType status = StatusType.PLAYING;
        do {
            try {
                this.display(); //displays the display method from this class

                //get the input command entered by user
                String input = this.getCommand();
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
