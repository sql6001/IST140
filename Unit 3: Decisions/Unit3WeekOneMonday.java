import java.util.Scanner;

/**
 *
 * @author shish
 */
public class Unit3WeekOneMonday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
	{
			/* 
			Write a program that calculates and prints the
			value of the coupon a person can receive based on groceries
			purchased using the table below.
			Prompt the user for the amount of their groceries, as integers.
			Verify that the user input is an integer.
			If so, read in the input and determine the value of the
			coupon based on the following information
			Money spent:                           Coupon %:
			More than $210                          14%
			More than $150 - 210                    12%
			More than $60 - 150                     10%
			From $10 - 60                            8%
			Less than $10                           No coupon
			*/
			
			Scanner scnr = new Scanner (System.in);
			double amount = 0;
			double coupon = 0.0;
			System.out.println("Enter the total amount of your groceries in dollars: ");
			amount = scnr.nextDouble();
					
			if (amount > 210)
			{
					coupon = .14;
			}
			else if (amount > 150 && amount <= 210)
			{
					coupon = .12;
			}
			else if (amount > 60 && amount <= 150)
			{
					coupon = .10;
			}
			else if (amount <= 60 && amount >10)
			{
					coupon = .08;
			}
			else
			{
					coupon = 0;
			}
			
			double discCoupon = amount * coupon;
			System.out.printf("You win a discount coupon of: $%.2f\n", discCoupon);
			
			//simplified if-else
			
			if (amount > 210)
			{
					coupon = .14;
			}
			else if (amount > 150)
			{
					coupon = .12;
			}
			else if (amount > 60)
			{
					coupon = .10;
			}
			else if (amount > 10)
			{
					coupon = .08;
			}
			else
			{
					coupon = 0;
			}

	}
}
