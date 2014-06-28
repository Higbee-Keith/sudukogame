package sudoku;
import java.util.Scanner; //Reads input from System.in

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class Sudoku {
    
    private static Scanner inFile = new Scanner(System.in);
    
    private String welcomeMessage =
              "\n\t***********************************************************************"
            + "\n\t* Welcome to the game of Sudoku!                                      *"       
            + "\n\t*                                                                     *"
            + "\n\t* Good Luck!!!                                                        *"
            + "\n\t***********************************************************************"
            + "\n";

    public Sudoku() {
    }
        
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        sudoku.display();
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.executeCommands(null);
    }
    
    private void display() {
        System.out.println(this.welcomeMessage);  
    }
    
    public static Scanner getInputFile() {
        return Sudoku.inFile;
    }
}
