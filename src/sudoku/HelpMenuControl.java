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
    public static void displayBoardHelp() {
        
    }
    
    //menu option displayNumbersHelp
    public static void displayNumbersHelp() {
        System.out.println("\t\tNumbers Help");
        System.out.println("\n\tInsert the numbers 1-9 into every row, column, and box."
                + "\nEvery row, column and box can only use each number once. "
                + "\nOnce every box is filled correctly, the game will be solved! \n");
    }
    
    //menu option displayPlayerHelp
    public static void displayPlayerHelp() {
        System.out.println("\t\tPlayer Help");
        System.out.println("\n\tThe player inserts numbers 1-9 in the empty "
                + "locations. The game is finished once the player successfully "
                + "fills in every location without repeating a number in any "
                + "given column or row. \n");
    }
    
    //menu option displayStatisticsHelp
    public static void displayStatisticsHelp() {
        System.out.println("\t\tStatistics Help");
        System.out.println("\n\tThe statistics show how many numbers are \n" +
                "currently correct and how many numbers are currently \n" +
                "incorrect.  They also calculate and show the percentage \n" +
                "of correct numbers.\n");
    }
    
    //menu option displayEndGameHelp
    public static void displayEndGameHelp() {
        System.out.println("\t\tEnding the Game Help");
        System.out.println("\n\tThe game ends either when the player\n"
                + "successfully completes the Sudoku puzzle correctly, or\n"
                + "if the player gets stuck and chooses to give up.  If the \n"
                + "player chooses to give up, the correct answers are shown, \n"
                + "and a new game must be started");
    }
    
    //menu option displayReturnToMainMenu
    public static void displayReturnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.executeCommands(null);
    }
}