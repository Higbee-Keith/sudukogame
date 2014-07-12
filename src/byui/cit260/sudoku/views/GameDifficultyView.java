package byui.cit260.sudoku.views;
import byui.cit260.sudoku.controls.GameDifficultyControl;
import byui.cit260.sudoku.enums.StatusType;
import byui.cit260.sudoku.exceptions.MenuException;
import byui.cit260.sudoku.models.Menu;
import byui.cit260.sudoku.interfaces.EnterInfo;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class GameDifficultyView extends Menu implements EnterInfo {
    //constructor
    public GameDifficultyView() {
        super(GameDifficultyView.menuItems);
    }
            
    //create an array of Strings for the help menu items
    private final static String[][] menuItems = {
        {"E", "Easy"},
        {"M", "Medium"},
        {"H", "Hard"},
        {"S", "Surprise Me"},
        {"R", "Return to Game Preferences menu"}
    };
    
    //create instance of HelpMenuControl
    private GameDifficultyControl gameDifficultyControl = new GameDifficultyControl();
    
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
                    case "E":
                        this.gameDifficultyControl.getGameDifficulty(input);
                        break;
                    case "M":
                        this.gameDifficultyControl.getGameDifficulty(input);
                        break;
                    case "H":
                        this.gameDifficultyControl.getGameDifficulty(input);
                        break;
                    case "S":
                        this.gameDifficultyControl.getGameDifficulty(input);
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