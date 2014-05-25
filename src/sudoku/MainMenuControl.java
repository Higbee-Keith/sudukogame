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
        
    }
    
    //menu option displayPlayerOptions
    public void displayPlayerOptions() {
        System.out.println("The player menu has been called.");
        //Uncomment these commands with the menu is complete
        PlayerMenuView playerMenuView = new PlayerMenuView();
        playerMenuView.getInput();
    }
    
    //menu option displayPreferences
    public void displayGamePreferences() {
        System.out.println("The game preferences menu has been called");
        //Uncomment these commands when the menu is complete
        //GamePreferencesView gamePreferencesView = new GamePreferencesView();
        //gamePreferencesView.getInput();
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
