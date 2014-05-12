
package sudoku;

/**
 *
 * @author imac
 */
public class Game {
    //Need to determine a solution to a game before starting a new game.
    //No point in playing a game without a solution!
    //Size of game to be pulled from Board.java
    Player player;
    
    public Game() {
        this.player = new Player();
        this.player.name = "Sudoku Master";
    }
    
    public void displayPlayer() {
        System.out.println("Are you ready to play, " + this.player.name + "?");
    }
}