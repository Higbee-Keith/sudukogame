package byui.cit260.sudoku.exceptions;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class MenuException extends Exception {
    
    public MenuException() {
    }
    
    public MenuException(String message) {
        super(message);
    }
    
    public MenuException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public MenuException(Throwable cause) {
        super(cause);
    }
}
