package byui.cit260.sudoku.enums;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public enum HelpType {
    BOARD ("The game of Sudoku is a number placement puzzle."
                + "\nIt consists of a 9x9 grid which contains nine 3x3 regions.  Each "
                + "\nregion must contain each number of 1-9.  In addition, the entire"
                + "\nrow and column a number resides in must not contain the same number."
                + "\nSo to successfully complete the puzzle, each row and column "
                + "\nmust contain unique numbers. \n"),
    
    NUMBERS ("Insert the numbers 1-9 into every row, column, and box."
                + "\nEvery row, column and box can only use each number once. "
                + "\nOnce every box is filled correctly, the game will be solved! \n"),
    
    PLAYER ("The player inserts numbers 1-9 in the empty "
                + "\nlocations. The game is finished once the player successfully "
                + "\nfills in every location without repeating a number in any "
                + "\ngiven column or row. \n"),
    
    STATISTICS ("The statistics show how many numbers are"
                + "\ncurrently correct and how many numbers are currently"
                + "\nincorrect.  They also calculate and show the percentage"
                + "\nof correct numbers.\n"),
    
    ENDGAME("The game ends either when the player"
                + "\nsuccessfully completes the Sudoku puzzle correctly, or"
                + "\nif the player gets stuck and chooses to give up.  If the "
                + "\nplayer chooses to give up, the correct answers are shown,"
                + "\nand a new game must be started. \n");
    
    String helpText;

    private HelpType(String helpText) {
        this.helpText = helpText;
    }

    public String getHelpText() {
        return helpText;
    }
}
