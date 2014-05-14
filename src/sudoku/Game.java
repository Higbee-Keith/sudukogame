
package sudoku;

/**
 *
 * @author imac
 */
public class Game {
    //Need to determine a solution to a game before starting a new game.
    //No point in playing a game without a solution!
    //Size of game to be pulled from Board.java
    
    //Declare a new player object
    Player player;
    
    public Game() {
        this.player = new Player();
        player.displayName();
    }
    
    public void displayPlayer() {
        System.out.println("\nHello, "  + this.player.name + ".  Enjoy your game!");
    }
    
}