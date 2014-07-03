package byui.cit260.sudoku.uncategorized;

import byui.cit260.sudoku.views.GamePreferencesView;
import byui.cit260.sudoku.views.PlayerMenuView;
import byui.cit260.sudoku.views.HelpMenuView;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class MainMenuControl {
    
    //default constructor
    public MainMenuControl() {
        
    }
    
    //menu option displayNewGame
    public void displayNewGame() {
        Grid newGrid = new Grid();
        newGrid.newGame();
    }
    
    //menu option displayPlayerOptions
    public void displayPlayerOptions() {
        PlayerMenuView playerMenuView = new PlayerMenuView();
        playerMenuView.getInput(null);
    }
    
    //menu option displayPreferences
    public void displayGamePreferences() {
        GamePreferencesView gamePreferencesView = new GamePreferencesView();
        gamePreferencesView.getInput(null);
    }
    
    //menu option displayHelpMenu
    public void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput(null);
    }
}