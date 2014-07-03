/*
 * This is just a simple super class because I found a common function among
 * the PlayerMenuControl.java GamePreferencesControl.java and HelpMenuControl.java
 * classes.  So I implemented the basic principles of inheritance and now they
 * inherit the common function of displayReturnToMainMenu() from this SuperControl
 * super class.
 */

package sudoku;

import byui.cit260.sudoku.views.MainMenuView;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class SuperControl {
    //menu option displayReturnToMainMenu
    public static void displayReturnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput(null);
    }
}
