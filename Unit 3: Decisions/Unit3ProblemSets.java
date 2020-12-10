import java.util.Scanner;

/**
 *
 * @author shish
 */
public class Unit3ProblemSets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*

    Examine the expression below. What is the value of the boolean variable myBoolean?
    **Write your answer as a single-line comment. **

    boolean myBoolean = (((75 < 200) && (600 < 550)) || (350 <= 450);
    
       
    */
        //=true
    /*

    Write a Java snippet to request a letter from the user. Use a switch case 
    statement to determine if the letter entered by the user is a vowel 
    (a, e, i, o, u).  If the user does not enter a vowel, use a default case to 
    tell the user they entered a consonant. 
    */
    Scanner scnr = new Scanner (System.in);
    System.out.println ("Enter a letter: ");
    char letter = scnr.next().charAt(0);
    
    switch (letter)
    {
        case 'a': System.out.println ("The letter entered by the user is a vowel"); break;
        case 'e': System.out.println ("The letter entered by the user is a vowel"); break;
        case 'i': System.out.println ("The letter entered by the user is a vowel"); break;
        case 'o': System.out.println ("The letter entered by the user is a vowel"); break;  
        case 'u': System.out.println ("The letter entered by the user is a vowel"); break;
        default: System.out.println ("You entered a consonant"); break;
    }
    /*

    Write Java code that reads a customer’s total purchase amount and determines
    their discount amount based on the total cost. Output the user’s discount 
    percentage and the new total with the discount applied.
    $200 or more – discount is 75%
    $100 or more – discount is 50%
    $50 or more – discount is 25%
    Less than $50 – no discount
    */
    System.out.println ("Enter the total purchase amount: ");
    double tot = scnr.nextDouble();
    double discount = 0.0;
    
    if (tot >= 200)
    {
        discount = .75;
    }
    else if (tot >= 100)
    {
        discount = .50;
    }
    else if (tot >= 50)
    {
        discount = .25;
    }
    else
    {
        discount = 0.0;
    }
    double perDiscount = discount * 100;
    System.out.println ("The discount percentage is: " + perDiscount + "%");
    
    double totCostWithDiscount = tot - (tot * discount);
    System.out.printf ("The total cost with the discount "
            + "is: $%.2f\n", totCostWithDiscount);
    /*

    Write a Java code snippet that requests an integer from the user between 0 
    and 99,999. The program should output whether the user has entered a single 
    digit number, two-digit number, three-digit number, four-digit number, 
    five-digit number, or if the value entered is out of range.
    */
    System.out.println("Enter an integer between 0 and 99,999: ");
    String num = scnr.next();
    int lengthNum = num.length();
    String output = ""; 
    
    if (lengthNum == 1)
    {
        System.out.println ("You have entered a single digit number.");
    }
    else if (lengthNum == 2)
    {
        System.out.println ("You have entered a two-digit number.");
    }
    else if (lengthNum == 3)
    {
        System.out.println ("You have entered a three-digit number.");
    }
    else if (lengthNum == 4)
    {
        System.out.println ("You have entered a four-digit number.");
    }
    else if (lengthNum == 5)
    {
        System.out.println ("You have entered a five-digit number.");
    }
    else
    {
        System.out.println ("The value that you entered is out of range.");
    }
    /*

    Use Java code to create a guessing game. Randomly generate an integer from 
    1-10.  The user gets two chances to guess the correct number.  If the user’s
    first guess is correct, tell the user they guessed correctly and end the 
    program.  If the first guess is incorrect, tell the user if their guess 
    was too high or too low, then prompt for Write a Java code snippet that requests an integer from the user between 0 
    and 99,999. The program should output whether the user has entered a single 
    digit number, two-digit number, three-digit number, four-digit number, 
    five-digit number, or if the value entered is out of range. another guess.  If the user’s 
    second guess is correct, tell the user they guessed correctly.  If the 
    user’s second guess is incorrect, tell the user they guessed incorrectly and
    give them the correct answer.
    */
    
    int randomNum = (int) (Math.random()*(10 - 1 + 1) + 1);
    System.out.println("Guess a number: ");
    int guess = scnr.nextInt();
    String result = "";
    
    if (guess == randomNum)
    {
        System.out.println ("You guessed the correct number!");
    }
    else if (guess > randomNum)
    {
        System.out.println ("Your guess is too high.");
        System.out.println ("Enter your second guess: ");
        int secGuess = scnr.nextInt();
        
        if (secGuess == randomNum)
        {
            System.out.println ("You guessed the correct number!");
        }
        else 
        {
            System.out.println ("You have guessed incorrectly.");
            System.out.println ("The correct number is: " + randomNum);
        }
    }
    
    else if (guess < randomNum)
    {
        System.out.println ("Your guess is too low.");
        System.out.println ("Enter your second guess: ");
        int secGuess = scnr.nextInt();
        if (secGuess == randomNum)
        {
            System.out.println ("You guessed the correct number!");
        }
        else 
        {
            System.out.println ("You have guessed incorrectly.");
            System.out.println ("The correct number is: " + randomNum);
        }
    }
    
    
    }
    
}
