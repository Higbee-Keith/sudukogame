package sudoku;

import byui.cit260.sudoku.views.PlayerNameView;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class PlayerMenuControl extends SuperControl {
    
    // default contructor
    public PlayerMenuControl() {
}
    
    //set and display as needed the player name.  currently unfinished/empty
    public void setPlayerName() {
        PlayerNameView playerName = new PlayerNameView();
        playerName.getName();
    }

}