package sudoku;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class GameDifficultyView extends Menu{
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
    public String executeCommands(Object object) {
        String input;
        do {
            this.display(); //displays the display method from this class
            
            //get the input command entered by user
            input = this.getCommand();
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
                    this.gameDifficultyControl.displayReturnToGamePreferencesMenu();
                    break;
            } 
        } while (!input.equals("R"));
        return input;
    }
}