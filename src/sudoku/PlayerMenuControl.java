package sudoku;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class PlayerMenuControl {
    
    // default contructor
    public PlayerMenuControl() {
}
    
    //set and display as needed the player name.  currently unfinished/empty
    public void setPlayerName() {
        System.out.println("This function has been called");
    }

    //menu option displayReturnToMainMenu
    public void displayReturnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.executeCommands(null);
    }
}
