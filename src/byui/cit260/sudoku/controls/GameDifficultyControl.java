package byui.cit260.sudoku.controls;

import byui.cit260.sudoku.views.GamePreferencesView;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class GameDifficultyControl {
    
    //default constructor
    public GameDifficultyControl() {
        
    }
    
    //declare variables
    private int difficultyLevel;

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
    
    public int getGameDifficulty(String input) {
        Random rand = new Random();
        int value;
        int max = 45, maxmin = 33, midmax = 32, midmin = 24, minmax = 23, min = 15;
        
        if (input.equals("E"))
            //nextInt is exclusive of top value, so add 1 to include it
            value = (rand.nextInt(max - maxmin) + 1) + maxmin;
        else if (input.equals("M"))
            value = (rand.nextInt(midmax - midmin) + 1) + midmin;
        else if (input.equals("H"))
            value = (rand.nextInt(minmax - min) + 1) + min;
        else
            //random integer including all easy-hard values
            value = rand.nextInt((max - min) + 1) + min;
        
        setDifficultyLevel(value);
        return value;
    }

    //menu option displayReturnToGamePreferencesMenu
    public void displayReturnToGamePreferencesMenu() {
        GamePreferencesView gamePreferencesView = new GamePreferencesView();
        gamePreferencesView.getInput(null);
    }
}
