package sudoku;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class GamePreferencesControl {
    
    //default constructor
    public GamePreferencesControl () {
        
    }
    
    //menu option getGameBorder
    public void displayGameBorder() {
        GetGameBoard gameBoard = new GetGameBoard();
        gameBoard.displayGameBorders();
    }
    
    //menu option displayGameDifficulty
    public void displayGameDifficulty() {
        System.out.println("This function has been called");
    }
    
    //menu option displayReturnToMainMenu
    public void displayReturnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.executeCommands(null);
    }
    

}
