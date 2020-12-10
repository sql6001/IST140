import java.util.Scanner;

/**
 *
 * @author shish
 */
public class Unit2Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*1.  Your club is selling hoagies (i.e., sandwiches) as a fund raiser for THON.

    Hoagies sell for $5.50, with 40% of the purchase price donated to THON. 

    You designed and coded a code snippte to prompt the user for the number of hoagies 

    they want to purchase.  Your code computes and outputs the total price 

    of the order and the amount of money which will be donated to THON from each order.

    Make sure to use constants where appropriate and format the output to 2 decimals places and 

    line up numbers in a column aligned by decimal point using format specifiers.

 

    Sample Input:  How many hoagies would you like to purchase?  2       

    Sample Output: 

    Your order total is:                          $11.00             

    Your donation to THON is:                     $4.40
        

 */
    Scanner scnr = new Scanner (System.in);
    System.out.println("How many hoagies would you like to purchase? ");
    int numHoagies = scnr.nextInt();
    final double HOAGIES = 5.50;
    final double TOTAL = HOAGIES * numHoagies;
    System.out.printf("Your order total is:         $%.2f\n", TOTAL);
    final double DONATION = TOTAL * 0.40;
    System.out.printf("Your donation to THON is:    $%.2f\n", DONATION);
    
    /*

2. Write Java code for the following

        Create a String containing the word "alphabetsoup".

         Break up the word into 3 smaller words "alpha", "bet", and "soup" using the

        Java substring method. Assign each substring to a separate String variable.

        Output the 3 words in reverse order, using the variable names. 

        Output the second character of second word.

        

        Sample Output: Your new word is soupbetalpha

                       The second character of the second word is e

*/
    String word = "alphabetsoup";
    String first = word.substring (0, 5);
    String second = word.substring (5, 8);
    String third = word.substring (8, word.length());
    String total = third+second+first;
    System.out.println("Your new word is " + total);
    char secondChar = second.charAt(1);
    System.out.println("The second character of the second word is " + secondChar);
    
    /*

 3. You know the following: about circles:

        The diameter is twice the Radius.

        To find the circumference, you double the radius and multiply by pi. 

        Ask the user for the radius.

          Calculate the circumference (integer portion)

           Calculate the circumference remainder (decimal portion)

          Output the results of your calculations in a single output statement.    "The circumference is ... and the remainder is...     "

    
*/  
    System.out.println("Enter the radius: ");
    double radius = scnr.nextInt();
    
    final double DIAMETER = 2 * radius;
    final double CIRCUMFERENCE = DIAMETER * Math.PI;
    System.out.println("The circumference is: " + CIRCUMFERENCE + " units");
    

    
    }
    
}
