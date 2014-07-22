package byui.cit260.sudoku.enums;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public enum StatusType {
    NEWGAME ("NEWGAME"),
    CONTINUE ("CONTINUE"),
    PLAYING ("PLAYING"),
    WINNER ("WINNER"),
    RETURN ("RETURN"),
    ERROR ("ERROR"),
    EXIT ("EXIT");
    
    String status;
    
    //overloaded constructor
    private StatusType(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }
}
