package byui.cit260.sudoku.models;

import byui.cit260.sudoku.exceptions.SudokuException;
import byui.cit260.sudoku.views.MainMenuView;
import byui.cit260.sudoku.frames.MainFrame;
import java.util.Scanner; //Reads input from System.in

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class Sudoku {
    public static MainFrame mainFrame = null;
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
            
//          /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    Sudoku.mainFrame = new MainFrame();
                    Sudoku.mainFrame.setVisible(true);
                }
            });
        }
        catch (Throwable ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
        finally {
            if (Sudoku.mainFrame != null) {
                Sudoku.mainFrame.dispose();
            }
        }
    }
    
    private void display() {
        System.out.println(this.welcomeMessage);  
    }
    
    public static Scanner getInputFile() {
        return Sudoku.inFile;
    }
}
