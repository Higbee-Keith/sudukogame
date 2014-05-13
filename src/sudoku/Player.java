package sudoku;
import java.util.Scanner; //Reads input from System.in

/**
 *
 * @author Higbee-Keith
 */
public class Player {
    //declare variables
    String name;
    long wins;
    double gametime;
    double totaltime;
    
    public Player() {
    }
    
    public void displayName() {
        Scanner getName = new Scanner(System.in);
        System.out.println("\nPlease enter your name.");
        name = getName.nextLine();
    }
}
