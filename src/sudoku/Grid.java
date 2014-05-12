package sudoku;

/**
 *
 * @author Higbee-Keith
 */
public class Grid {
    int givenNumbers = 23;
    
    public Grid(){
    }
    
    public void displaySize() {
        System.out.println("This game has predetermined "  
                + givenNumbers + " numbers for you.");
    }
}
