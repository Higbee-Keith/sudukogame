package sudoku;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class HelpMenuControl {
    
    //default constructor
    public HelpMenuControl () {
        
    }
    
    //menu option displayBoardHelp
    //Josiah to code this
    public void displayBoardHelp() {
        
    }
    
    //menu option displayNumbersHelp
    //Daniel to code this
        public void displayNumbersHelp() {
        System.out.println("\t\tNumbers Help");
        System.out.println("\n\tInsert the numbers 1-9 into every row, column, and box."
                + "\nEvery row, column and box can only use each number once. "
                + "\nOnce every box is filled correctly, the game will be solved! \n");
    }
        
    }
    
    //menu option displayPlayerHelp
    //Jessie to code this
    public void displayPlayerHelp() {
        displayHelpBorder();
        System.out.println("\t\tPlayer Help");
        System.out.println("\n\tThe player inserts numbers 1-9 in the empty "
                + "locations. The game is finished once the player successfully "
                + "fills in every location without repeating a number in any "
                + "given column or row. \n");
        displayHelpBorder();
        
    }
    
    //menu option displayStatisticsHelp
    //Keith to code this
    public void displayStatisticsHelp() {
        displayHelpBorder();
        System.out.println("\t\tStatistics Help");
        System.out.println("\n\tThe statistics show how many numbers are \n" +
                "currently correct and how many numbers are currently \n" +
                "incorrect.  They also calculate and show the percentage \n" +
                "of correct numbers.\n");
        displayHelpBorder();
    }
    
    //menu option displayEndGameHelp    
    //Jae to code this
    public void displayEndGameHelp() {
        
    }
    
    //menu option displayReturnToMainMenu
    public void displayReturnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();
    }
    
    public void displayHelpBorder() {
        System.out.println(
                "------------------------------------------------------------");
    }
}
