package byui.cit260.sudoku.enums;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public enum ErrorType {    
    ERROR101 ("Invalid command. Please enter a valid command."),
    
    ERROR107 ("You must enter a name or enter a \"Q\" to quit. Try again."),
    
    ERROR108 ("The game parameter is null."),
    
    ERROR109 ("You must enter two numbers, a row and the column, "
              + "or a \"Q\" to quit. Try again.");

    
    String error;
    
    ErrorType(String error) {
        this.error = error;
    }
    
    public String getError() {
        return this.error;
    }
    
    public void display() {
        System.out.println(this.error);
    }
}
