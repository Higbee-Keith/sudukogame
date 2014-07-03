package byui.cit260.sudoku.uncategorized;

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
    public int difficultyLevel;

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
    
    public int getGameDifficulty(String input) {
        Random rand = new Random();
        int value;
        int max = 45, max1 = 33, mid = 32, mid1 = 24, min1 = 23, min = 15;
        
        if (input.equals("E"))
            //nextInt is exclusive of top value, so add 1 to include it
            value = (rand.nextInt(max - max1) + 1) + max1;
        else if (input.equals("M"))
            value = (rand.nextInt(mid - mid1) + 1) + mid1;
        else if (input.equals("H"))
            value = (rand.nextInt(min1 - min) + 1) + min;
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
