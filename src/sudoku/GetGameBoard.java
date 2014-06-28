package sudoku;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class GetGameBoard {
    
//default constructor
    public GetGameBoard() {
        
    }
    
    public void displayGameBorders() {
        //display game borders
        System.out.println("-------------------------------------------------------");
    
        for (int x = 0; x < 9; x++) {
            System.out.print("|     |     |     |     |     |     |     |     |     |\n");
            System.out.println("-------------------------------------------------------");
        }
    }
}
