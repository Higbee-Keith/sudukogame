package sudoku;
import java.util.Scanner; //Reads input from System.in
import java.io.Serializable;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class Player implements Serializable {
    //declare variables
    private String name;
    private long wins = 0;
    private double gametime;
    private double totaltime;
    
    public Player() {
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public long getWins() {
        return wins;
    }
    
    public void setWins(long wins) {
        this.wins = wins;
    }
    public double getGameTime() {
        return gametime;
    }
    
    public void setGameTime(double gametime) {
        this.gametime = gametime;
    }
    
    public double getTotalTime() {
        return totaltime;
    }
    
    public void setTotalTime(double totaltime) {
        this.totaltime = totaltime;
    }
}
