package byui.cit260.sudoku.enums;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public enum Error {    
    ERROR101 ("Invalid command. Please enter a valid command."),
    
    ERROR102 ("You must enter two numbers, the number rows and columns, "
              + "or a \"Q\" to quit. Try again."),
    
    ERROR106 ("You must start a new game first."),
    
    ERROR107 ("You must enter a name or enter a \"Q\" to quit. Try again."),
    
    ERROR108 ("The game parameter is null."),
    
    ERROR109 ("You must enter two numbers, a row and the column, "
              + "or a \"Q\" to quit. Try again."),
    
    ERROR201 ("No empty locations found on the board"),
    
    ERROR203 ("This location is already occupied. Try a different "
              + "location."),
    
    ERROR204 ("Enter a non-blank character for the player's marker."),
    
    ERROR205 ("Both players can not use the same character for a marker."),
    
    ERROR206 ("There is no active game. You must start a new game before "
              + "you can take a turn"), 
    
    ERROR207 ("The number of rows must be between 3 - 9 and the "
              + "number of columns must be between 3 - 9 "),
    
    ERROR209 ("GameCommands - takeTurn: invalidPlayerTYpe");

    
    String error;
    
    Error(String error) {
        this.error = error;
    }
    
    public String getError() {
        return this.error;
    }
    
    public void display() {
        System.out.println(this.error);
    }
}
