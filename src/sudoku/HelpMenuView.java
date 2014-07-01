package sudoku;
import java.util.Scanner;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class HelpMenuView extends Menu{
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
    public String executeCommands(Object object) {
        String input;
        do {
            this.display(); //displays the display method from this class
            
            //get the input command entered by user
            input = this.getCommand();
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
                    this.helpMenuControl.displayReturnToMainMenu();
                    break;
            } 
        } while (!input.equals("R"));
        return input;
    }
}
