package sudoku;
import java.util.Scanner; //Reads input from System.in

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class Game {    
    //Declare a new player object
    Player player;
    
    public Game() {
        this.player = new Player();
        player.getName();
    }
    
    //public void displayPlayer() {
    //    System.out.println("\nHello, "  + this.player.name + ".");
    //}
    
    public void displayHelp() {
        String help;
        
        Scanner input = new Scanner(System.in);
        System.out.println("\nWould you like to review the instructions?  y or n");
        help = input.nextLine();
        if (help.equals("y"))
            System.out.print("\nThe game of Sudoku is a number placement puzzle."
                            + "\nIt consists of a 9x9 grid which contains nine 3x3 regions.  Each "
                            + "\nregion must contain each number of 1-9.  In addition, the entire"
                            + "\nrow and column a number resides in must not contain the same number."
                            + "\nSo to successfully complete the puzzle, each row and column "
                            + "\nmust contain unique numbers\n");
        else
            System.out.println("\nNo instuctions eh?  Okay.  Enjoy your game!\n");
    }
    
}