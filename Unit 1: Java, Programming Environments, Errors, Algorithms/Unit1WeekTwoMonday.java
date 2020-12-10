import java.util.Scanner;
/**
 *
 * @author shish
 */
public class Unit1WeekTwoMonday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		/*
		You are out to dinner with friends and you want to split the
		cost of the bill, including a 15% top.
		Calculate the amount of money each person has to pay.
		Print the amount of the bill, the toal tip,
		the toal cost, and the amount each person has to pay for the dinner,
		the tip and the total.
		
		Step 1. Determine what you know and what information you need.
		
		Step 2. Determine Input needed from user.
				- How many people
				- price of bill
		Step 3. Determine equations
				total tip = total cost of bill * 0.15
				total bill including tip = total tip + total bill
				dinner price per person = total bill / num people
				dinner price per person with tip = total bill with tip / num people
		*/
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("What is the total amount of your dinner bill?");
		double totBill = scnr.nextDouble();//get tinput from user
		
		System.out.println("How many people are in your dinner party?");
		int numPersons = scnr.nextInt();
		
		double totTip1 = totBill * .15;
		double totAmount = totBill + totTip1;
		double dinnerPP = totBill / numPersons;
		double tipPP = totTip1 / numPersons;
		double totAmountPP = totAmount / numPersons;
		
		System.out.println("The amount of your bill before tip is: $" + totBill);
		System.out.println("The amount of the tip is: $" + totTip1);
		System.out.println("The total amount including tip is: $" + totAmount);
		System.out.println("The amount of the bill per person is: $" + dinnerPP);
		System.out.println("The amount of the tip per person is: $" + tipPP);
		System.out.println("The total amount including top per person is: $" + totAmountPP);
		
		//END MAIN
		
        
        
    }
    
}