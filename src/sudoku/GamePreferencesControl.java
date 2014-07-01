package sudoku;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class GamePreferencesControl extends SuperControl {
    
    //default constructor
    public GamePreferencesControl () {
        
    }
    
    //menu option getGameBorder
    public void displayGameBorder() {
        GetGameBoard gameBoard = new GetGameBoard();
        gameBoard.displayGameBorders();
    }
    
    //menu option displayGameDifficulty
    public void setGameDifficulty() {
        GameDifficultyView gameDifficulty = new GameDifficultyView();
        gameDifficulty.executeCommands(null);
    }
    
    

}
