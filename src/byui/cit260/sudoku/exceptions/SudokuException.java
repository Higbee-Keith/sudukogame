package byui.cit260.sudoku.exceptions;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class SudokuException extends Exception {
    
    public SudokuException() {
    }
    
    public SudokuException(String message) {
        super(message);
    }
    
    public SudokuException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public SudokuException(Throwable cause) {
        super(cause);
    }
}
