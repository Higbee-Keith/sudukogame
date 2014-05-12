package sudoku;

/**
 *
 * @author Higbee-Keith
 */
public class Player {
    String name;
    long wins;
    double gametime;
    double totaltime;
    
    public Player() {
    }
    
    public void displayName() {
        System.out.println("\t\tHello, my name is "  + this.name); 
    }
}
