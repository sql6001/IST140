import java.util.Scanner;

/**
 *
 * @author shish
 */
public class Unit2ProblemSets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    /*
    Write Java code to determine how a flower shop computes the price of an order.
    Prompt the user for the total price of the order and the number of flower 
    arrangements ordered.  Compute the tax which is 7% of the order price. 
    Compute the total shipping charge which is $3 per arrangement.  Output the 
    tax amount, shipping charge, and total price of the order after tax and 
    shipping.  Make sure your output is formatted to two decimal places.            
    */
    
    Scanner scnr = new Scanner (System.in);
    System.out.println("Enter the total price of the order: ");
    double totPrice = scnr.nextDouble();
    System.out.println("Enter the number of flower arrangements: ");
    int numFlower = scnr.nextInt();
    
    double taxCost = totPrice * 0.07;
    System.out.printf("The tax amount is: $%.2f\n", taxCost );
    
    double shippingCost = 3 * numFlower;
    System.out.printf("The shipping cost is: $%.2f\n", shippingCost);
    
    double totEverything = totPrice + taxCost + shippingCost;
    System.out.printf("The total price of the order after tax and shipping "
            + "is: $%.2f\n",totEverything );
    
    /*
    Mary is baking 4 batches of chocolate chip cookies. Each batch requires 
    2 cups of flour.  Assuming she starts with 11 cups of flour, how many 
    cups will remain once all 4 batches are completed?  Use the modulo 
    operator to perform this calculation.  Output “The remaining cups of 
    flour after making 4 batches of cookies is“ followed by the result of 
    your calculation.      
    */
    
    final int BATCHES = 4;
    final int EACH_BATCH_REQUIRES = 2;
    final int TOTAL_CUPS_NEEDED = BATCHES * EACH_BATCH_REQUIRES;
    final int START_CUPS_OF_FLOUR = 11; 
    final int REMAIN = START_CUPS_OF_FLOUR % TOTAL_CUPS_NEEDED;
    System.out.println("The remaining cups of flour after making 4 batches of "
            + "cookies is: " + REMAIN);
    
    
    /*
    Write Java code that prompt the user for their 10-digit phone number. Then, 
    output the phone number with the proper formatting.  For example, if the 
    user inputs 8148654700 the program should output (814)865-4700.
    */
    System.out.println("Enter your 10-digit phone number");
    String phoneNum = scnr.next();
    System.out.println("("+ phoneNum.substring (0, 3) + ")" 
            + phoneNum.substring(3, 6) + "-" + phoneNum.substring(6, 10));
    
    /*
    Write Java code for determining an individual’s username that prompts the 
    user for their first, middle, and last name. The program should output the 
    individual’s new username as the last name, first initial, and middle 
    initial.  For example, if the user enters their full name as John Michael 
    Smith, the program should output SmithJM.
    */
    System.out.println("Enter your first name: ");
    String firstName = scnr.next();
    System.out.println("Enter your middle name: ");
    String middleName = scnr.next();
    System.out.println("Enter your last name: ");
    String lastName = scnr.next();
    
    char n = firstName.charAt(0);
    char m = middleName.charAt (0);
    
    System.out.println("Your username is: " + lastName + n + m);
    
    /*

    Implement a program that directs a baker on the quantity to make of each 
    baked good for a day. Prompt the user for the total number of cups of sugar 
    supplied for the day.  A cake calls for 5 cups of sugar, a pie calls for 3 
    cups of sugar, cupcakes call for 2 cups of sugar, and cookies call for 1 cup
    of sugar.  The baker wants to make as many of each baked good as they can 
    before moving onto the next item with the remaining sugar.  For example, 
    if the user enters that they have 34 cups of sugar total, the program would 
    output:
    Cakes: 6

    Pies: 1

    Cupcakes: 0

    Cookies: 1 

    */
    System.out.println("Enter the total number of cups of sugar: ");
    int cupsSugar = scnr.nextInt();
    
    final int CAKE = 5;
    final int PIE = 3;
    final int CUPCAKES = 2;
    final int COOKIES = 1;
    
    int totCakes = cupsSugar / CAKE;
    int remainingCupsAfterCake = cupsSugar % CAKE; 
    int totPies = remainingCupsAfterCake / PIE;
    int remainingCupsAfterPie = remainingCupsAfterCake % PIE;
    int totCupcakes = remainingCupsAfterPie / CUPCAKES;
    int remainingCupsAfterCupcakes = remainingCupsAfterPie % CUPCAKES;
    
    int totCookies = remainingCupsAfterCupcakes / COOKIES;
    
    
    
    System.out.println("Cakes: " + totCakes);
    System.out.println("Pies: " + totPies);
    System.out.println("Cupcakes: " + totCupcakes);
        System.out.println("Cookies: " + totCookies);

    }
    
}