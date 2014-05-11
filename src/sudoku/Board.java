package sudoku;

/**
 *
 * @author Higbee-Keith
 */
public class Board {
    int givenNumbers = 23;
    
    public Board(){
    }
    
    public void displaySize() {
        System.out.println("This game has predetermined "  
                + givenNumbers + " spaces for you.");
    }
}
