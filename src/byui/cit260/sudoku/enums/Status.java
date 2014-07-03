package byui.cit260.sudoku.enums;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public enum Status {
    NEWGAME ("Start a new game"),
    CONTINUE ("Continue a game"),
    PLAYING ("Game is currently in play"),
    WIN ("You have won"),
    QUIT ("You are quitting an unsaved game"),
    ERROR ("An error has occurred"),
    EXIT ("Exiting the game");
    
    String status;
    
    //overloaded constructor
    private Status(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void display() {
        System.out.println(this.status);
    }
}
