package byui.cit260.sudoku.uncategorized;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

import java.util.Scanner;

public class Menu {
    private String[][] menuItems = null;
    
//default constructor
    public Menu() {
    }
    
    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }
        
    public String[][] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }
    
    public void displayHelpBorder() {
        System.out.println(
                "------------------------------------------------------------");
    }
    
    //displays the menu items
    public void display() {
        System.out.println("\n**************************************************\n");
        
        //for loop to cycle through array of menu items
        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\n**************************************************");
    }
    
    //check for valid input
    private boolean validCommand(String input) {
        //loop through array of menuItems
        for (String[] item : this.menuItems) {
            if (item[0].equals(input)) {
                return true;
            }
        }
        return false;
    }
    
    //get input command
    protected final String getCommand() {
        String input;
        Scanner getCommand = new Scanner(System.in);
        boolean isValid = false;
        
        do {
            //get the input command entered by user
            input = getCommand.nextLine();
            input = input.trim().toUpperCase();  //forces input to validate to uppercase
            
            //check if input is valid
            isValid = validCommand(input);
            if (!validCommand(input)) {
                System.out.println("Invalid command. Please input a valid command.");
                continue;
            }
        } while (!isValid);
        return input;
    }
}



