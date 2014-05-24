package sudoku;
import java.util.Scanner;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class HelpMenuView {

    //create an array of Strings for the help menu items
    private final static String[][] helpMenuItems = {
        {"B", "Board help"},
        {"N", "Numbers help"},
        {"P", "Player help"},
        {"S", "Statistics help"},
        {"E", "End game help"},
        {"R", "Return to main menu"}
    };
    
    //create instance of HelpMenuControl
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    //default constructor
    public HelpMenuView() {
        
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
                case "B":
                    this.helpMenuControl.displayBoardHelp();
                    break;
                case "N":
                    this.helpMenuControl.displayNumbersHelp();
                    break;
                case "P":
                    this.helpMenuControl.displayPlayerHelp();
                    break;
                case "S":
                    this.helpMenuControl.displayStatisticsHelp();
                    break;
                case "E":
                    this.helpMenuControl.displayEndGameHelp();
                    break;
                case "R":
                    this.helpMenuControl.displayReturnToMainMenu();
                    break;
                default:
                    System.out.println("Please enter a valid command");
                    continue;                    
            } 
        } while (!input.equals("R"));
        return;
    }
    
    //displays the help menu
    public void display() {
        System.out.println("\n**************************************************\n");
        //for loop to cycle through array of menu items
        System.out.println("\t\tHelp Menu\n");
        for (int i = 0; i < HelpMenuView.helpMenuItems.length; i++) {
            System.out.println("\t " + helpMenuItems[i][0] + "\t" + helpMenuItems[i][1]);
        }
        System.out.println("\n**************************************************");
    }
}
