package sudoku;

import java.util.Scanner;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class PlayerMenuView {
    
    // create an array of strings to act as player menu items
    private final static String [][] playerMenuItems = {
        {"N", "Enter Player's Name"},
        {"R", "Return to Main Menu"}
            
            };
    
    // create instance of playermenucontrol
    private PlayerMenuControl playerMenuControl = new PlayerMenuControl();
    
    // default constructor
    public PlayerMenuView(){
        
    }
    //call the display method and get user input
    public void getInput() {
        String input;
        Scanner getCommand = new Scanner(System.in);
        
        do {
            this.display(); //displays the display method from this class
            
            //get the input command entered by user
            System.out.println("\nPlease enter a valid command");
            input = getCommand.nextLine();
            input = input.trim().toUpperCase();  //forces input to validate to uppercase
            
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
    }

    //displays the main menu
    public void display() {
        System.out.println("\n**************************************************\n");
        //for loop to cycle through array of menu items
        System.out.println("\t\tPlayer Menu\n");
        for (int i = 0; i < PlayerMenuView.playerMenuItems.length; i++) {
            System.out.println("\t " + playerMenuItems[i][0] + "\t" + playerMenuItems[i][1]);
        }
        System.out.println("\n**************************************************");
    }
}