import java.util.Scanner;

/**
 *
 * @author shish
 */
public class Unit3WeekOneWednesday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*
Write a program that calculates a tip for a restaurant bill.
The tip varies depending on the the level of satisfaction
with the dining experience and the size of the group.

Ask for the diner's satisfaction level using these ratings:
1 = Totally satisfied,
2 = Satisfied,
3 = Dissatisfied.

1. Ask for the number of people in the group.

2. Ask for the amount of the bill

3. Ask for the level of satisfaction.

        
For large dinner parties (8 diners or more):
If the diner is totally satisfied, calculate a 20 percent tip.
If the diner is satisfied, calculate a 17 percent tip.
If the diner is dissatisfied, calculate a 12 percent tip.

For small groups (less than 8 people):
If the diner is totally satisfied, calculate a 18 percent tip.
If the diner is satisfied, calculate a 15 percent tip.
If the diner is dissatisfied, calculate a 10 percent tip.

4. Report the satisfaction level and the tip in dollars and cents.
*/

        Scanner scnr = new Scanner (System.in);
        System.out.println("Whar was your level of satisfaction?"
                + " Type 1, 2, or 3 from totally staisfied to least");
        
        int satisNum = scnr.nextInt();
        
        System.out.println("What is the amount of your bill? Enter in "
                + "dollars and cents.");
        double amtBill = scnr.nextDouble ();
        
        System.out.println("How many people in your party?");
        int numGroup = scnr.nextInt();
        
        double amtTip = 0;//initializing
        String satisLevel = "";
        
    if (numGroup < 8)
    {
        if (satisNum == 1)
        {
            amtTip = .18;
            satisLevel = "Totally Satisfied";
        }
        else if (satisNum == 2)
        {
            amtTip = .15;
            satisLevel = "Satisfied";
        }
        else
        {
            amtTip = .10;
            satisLevel = "dissatisfied";
        }
    }
    
    else
    {
        if (satisNum == 1)
        {
            amtTip = .20;
            satisLevel = "Totally Satisfied";
        }
        else if (satisNum == 2)
        {
            amtTip = .17;
            satisLevel = "Satisfied";
        }
        else
        {
            amtTip = .12;
            satisLevel = "dissatisfied";
        }
    }
        
        
        double totTip = amtBill * amtTip;
        System.out.printf("Your satisfaction level is: " + satisLevel + 
                " and your tip total is: $%.2f\n", totTip);
        
        
        
        
    }
    
}