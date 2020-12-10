import java.util.Scanner;

/**
 *
 * @author shish
 */
public class Unit3InClassAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /*

1. Prompt the user to enter two values of type double: price and weight.

2. Decide the shipping cost based on the following rules:
When the price is more than 100 ($) and the weight is more than 10 (lbs) shipping is $20
When the price is less than or equal to 100 ($) and the weight is more than 10 (lbs) shipping is $15
When the price is more than 100 ($) and the weight is less than or equal to 10 (lbs) shipping is $10
When the price is less than or equal to 100 ($) and the weight is less than or equal to 10 (lbs) shipping is $5


3. Sum the price and the shipping cost and output: “Your total price is X” where X is the total price.

Two Approaches to use:

1.  First, code this problem using Boolean Conditions (e.g. see flowchart in Canvas).

2. Second, code the problem using nested if statements (e.g. see flowchart in Canvas).

3.  Code both in the same program.
*/

//Shishan Li
       Scanner scnr = new Scanner (System.in);
        System.out.println("Boolean Condition");
       System.out.println("Enter the price: ");
       double price = scnr.nextDouble();
       System.out.println ("Enter the weight: ");
       double weight = scnr.nextDouble();
       
       double shipping = 0.0;
      
// Boolean Condition        
       if (price > 100 && weight >10)
       {
           shipping = 20;
       }
       else if (price <=100 && weight>10)
       {
           shipping = 15;
       }
       else if (price >100 && weight <=10)
       {
           shipping = 10;
       }
       else 
       {
           shipping = 5;
       }
       
       double totPrice = price + shipping;
       System.out.printf("Your total price is: $%.2f\n", totPrice);
               

//nested ifs
        
        System.out.println("Nested if statement");
        System.out.println("Enter the price again: ");
        
        double price2 = scnr.nextDouble();
        System.out.println("Enter the weight again: ");
        double weight2 = scnr.nextDouble ();
        
        double totPrice2 = price2 + shipping;
        
        
       if (price >100)
       {
           if (weight > 10)
           {
               shipping = 20;
           }
           else 
           {
               shipping = 10;
           }
       }
       else
       {
           if (weight > 10)
           {
               shipping = 15;
           }
           else 
           {
               shipping = 5;
           }
       }
     
        System.out.printf("Your total price is: $%.2f\n", totPrice2);
      
    }
    
}
