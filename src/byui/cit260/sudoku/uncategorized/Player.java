package byui.cit260.sudoku.uncategorized;
import java.io.Serializable;
import java.util.Objects;

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
    
    public String getPlayerStatistics() {
        String playerStatistics = 
                this.getName() + " has solved " + this.getWins()
                + " puzzles, " + "with a total time of "
                + this.getTotalTime() + ".";
        return playerStatistics;
    }
}