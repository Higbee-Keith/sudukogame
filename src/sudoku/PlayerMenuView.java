package sudoku;
import java.util.Scanner;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class PlayerMenuView extends Menu{
    //constructor
    public PlayerMenuView() {
        super(PlayerMenuView.menuItems);
    }
    
    // create instance of playermenucontrol
    private PlayerMenuControl playerMenuControl = new PlayerMenuControl();
    
    // create an array of strings to act as player menu items
    private final static String [][] menuItems = {
        {"N", "Enter Player's Name"},
        {"R", "Return to Main Menu"}
    };
    
//call the display method and get user input
    @Override
    public String executeCommands(Object object) {
        String input;
        do {
            this.display(); //displays the display method from this class
            
            //get the input command entered by user
            input = this.getCommand();
            switch (input) {
                case "N":
                    this.playerMenuControl.setPlayerName();
                    break;
                case "R":
                    this.playerMenuControl.displayReturnToMainMenu();
                    break;
                default:
                    System.out.println("Please enter a valid command");                    
            } 
        } while (!input.equals("X"));
        return input;
    }
}