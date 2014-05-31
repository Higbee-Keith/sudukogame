package sudoku;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class MainMenuControl {
    
    //default constructor
    public MainMenuControl () {
        
    }
    
    //menu option displayNewGame
    public void displayNewGame() {
        Grid newGrid = new Grid();
        newGrid.newGame();
    }
    
    //menu option displayPlayerOptions
    public void displayPlayerOptions() {
        PlayerMenuView playerMenuView = new PlayerMenuView();
        playerMenuView.getInput();
    }
    
    //menu option displayPreferences
    public void displayGamePreferences() {
        GamePreferencesView gamePreferencesView = new GamePreferencesView();
        gamePreferencesView.getInput();
    }
    
    //menu option displayHelpMenu
    public void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput();
    }
    
    public void displayHelpBorder() {
        System.out.println(
                "------------------------------------------------------------");
    }
}
