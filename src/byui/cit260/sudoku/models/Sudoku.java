package byui.cit260.sudoku.models;

import byui.cit260.sudoku.exceptions.SudokuException;
import byui.cit260.sudoku.views.MainMenuView;
import java.util.Scanner; //Reads input from System.in

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class Sudoku {
    
    private static Scanner inFile = new Scanner(System.in);
    
    private String welcomeMessage =
              "\n***********************************************************************"
            + "\n* Welcome to the game of Sudoku!                                      *"       
            + "\n*                                                                     *"
            + "\n* Good Luck!!!                                                        *"
            + "\n***********************************************************************"
            + "\n";

    public Sudoku() {
    }
        
    public static void main(String[] args) {
        try {
            
        Sudoku sudoku = new Sudoku();
        sudoku.display();
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput(null);
        }
        catch (Throwable ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
        finally {
            Sudoku.inFile.close();
        }
    }
    
    private void display() {
        System.out.println(this.welcomeMessage);  
    }
    
    public static Scanner getInputFile() {
        return Sudoku.inFile;
    }
}
