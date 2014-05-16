package sudoku;
import java.util.Scanner; //Reads input from System.in

/**
 *
 * @author Higbee-Keith
 */
public class Player {
    //declare variables
    String name;
    long wins;
    double gametime;
    double totaltime;
    
    //declare variables for tax function
    double moneymade, tax, total;
    int income;
    
    public Player() {
    }
    
    public void displayName() {
        //Scanner getName = new Scanner(System.in);
        //System.out.println("\nPlease enter your name.");
        //name = getName.nextLine();
        calculatedTax();
    }
    
    public double calculatedTax() {
        //the following lines are for the tax function
        //for Week3 Paired Programming assignment
        Scanner getName = new Scanner(System.in);
        System.out.println("\nPlease enter your name.");
        name = getName.nextLine();
        
        Scanner getIncome = new Scanner(System.in);
        System.out.println("\nPlease enter your income.");
        moneymade = getIncome.nextDouble();
        
        //Cast moneymade to an integer to remove all decimals
        income = (int) moneymade;
        
        //Determine tax bracket
        if (income > 0 & income < 10000) { 
            tax = income * .1;}
        else if (income > 10001 & income < 20000) {
            tax = income * .15; }
        else if (income > 20001 & income < 30000) {
            tax = income * .2; }
        else if (income > 30000) {
            tax = income * .25;}
        else if (income <= 0) {
            tax = 0;}
        
        total = income - tax;
        
        System.out.println("Hello " + name + ".  You owe " + tax "in taxes.");
        System.out.println("\nYour total income after taxes is: " + total + ".");        
        return tax;            
    }
}
