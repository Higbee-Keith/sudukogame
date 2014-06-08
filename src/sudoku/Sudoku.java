package sudoku;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class Sudoku {

    String welcomeMessage =
              "\n\t***********************************************************************"
            + "\n\t* Welcome to the game of Sudoku!                                      *"       
            + "\n\t*                                                                     *"
            + "\n\t*                                                                     *"
            + "\n\t* Good Luck!!!                                                        *"
            + "\n\t***********************************************************************"
            + "\n";
    
    public Sudoku() {
        
    }
    
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        sudoku.display();
        
        //Grid grid = new Grid();
        //grid.displaySize();
        
        //Game game = new Game();
        //game.displayPlayer();
        //game.displayHelp();
        
        //grid.percentCompletion();
        
        //HelpMenuView help = new HelpMenuView();
        //help.getInput();
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();
    }
    
    private void display() {
        System.out.println(this.welcomeMessage);
        
    }

/**
 * @author Allen-Daniel
 * Check 9 boxes for completion
 */
    
    String correctMessage =
        "\n\t This section is correct."       
      + "\n";
    
    String incorrectMessage =
        "\n\t This section is incorrect."       
      + "\n";
       
    private boolean blockcheck(byte a, byte b, byte c, byte d, byte e, byte f, byte g, byte h, byte i) {
        int[] BlockArray = {a, b, c, d, e, f, g, h, i};
        int sum = 0;
        for (double s : BlockArray) {
            sum += s;
                            }
    
        if (sum == 45) {
            System.out.print(correctMessage);
            return true;
        }
        else {
            System.out.print(incorrectMessage);
            return false;
        }}}
