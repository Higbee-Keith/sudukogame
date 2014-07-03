package byui.cit260.sudoku.views;

import java.util.Scanner;
import byui.cit260.sudoku.uncategorized.Sudoku;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class PlayerNameView {

    //default constructor
    public PlayerNameView() {
        
    }
    
    public Object getName() {
        String name = null;
        Scanner input = Sudoku.getInputFile();
        
        boolean isValid = false;
        do {
            System.out.println("Please enter the player's name");
            name = input.nextLine();
            name = name.trim().toUpperCase();
            name = name.trim();
            if (name.equals("Q")) {
                return null;
            }
            
            isValid = true;
        } while (!isValid);
        return name;
    }
}
