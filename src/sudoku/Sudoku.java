package sudoku;

/**
 *
 * @author Higbee-Keith
 */

public class Sudoku {

    String welcomeMessage =
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
        Sudoku.display();
        
        Board board = new Board();
        board.displaySize();
        
        Game game = new Game();
        //game.displayPlayers();
    }
    
    private void display() {
        System.out.println(this.welcomeMessage);
    }
    
}
