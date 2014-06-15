/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

/**
 *
 * @author imac
 */
public class GetGameBoard {
    
//default constructor
    public GetGameBoard() {
        
    }
    
    public void displayGameBorders() {
        //display game borders
        System.out.println("-------------------------------------------------------");
    
        for (int x = 0; x < 9; x++) {
            System.out.print("|     |     |     |     |     |     |     |     |     |\n");
            System.out.println("-------------------------------------------------------");
        }
    }
}
