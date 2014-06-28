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
        System.out.print("\t\tThe game of Sudoku is a number placement puzzle."
                + "\nIt consists of a 9x9 grid which contains nine 3x3 regions.  Each "
                + "\nregion must contain each number of 1-9.  In addition, the entire"
                + "\nrow and column a number resides in must not contain the same number."
                + "\nSo to successfully complete the puzzle, each row and column "
                + "\nmust contain unique numbers. \n");
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
                + "\nlocations. The game is finished once the player successfully "
                + "\nfills in every location without repeating a number in any "
                + "\ngiven column or row. \n");
    }
    
    //menu option displayStatisticsHelp
    public static void displayStatisticsHelp() {
        System.out.println("\t\tStatistics Help");
        System.out.println("\n\tThe statistics show how many numbers are"
                + "\ncurrently correct and how many numbers are currently"
                + "\nincorrect.  They also calculate and show the percentage"
                + "\nof correct numbers.\n");
    }
    
    //menu option displayEndGameHelp
    public static void displayEndGameHelp() {
        System.out.println("\t\tEnding the Game Help");
        System.out.println("\n\tThe game ends either when the player"
                + "\nsuccessfully completes the Sudoku puzzle correctly, or"
                + "\nif the player gets stuck and chooses to give up.  If the "
                + "\nplayer chooses to give up, the correct answers are shown,"
                + "\nand a new game must be started. \n");
    }
    
    //menu option displayReturnToMainMenu
    public static void displayReturnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.executeCommands(null);
    }
}