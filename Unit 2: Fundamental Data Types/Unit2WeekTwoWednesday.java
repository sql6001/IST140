import java.util.Scanner;

/**
 *
 * @author shish
 */
public class Unit2WeekTwoWednesday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
    1. Create a program to create an ID for a student by
    taking the first letter of their first name and adding
    the last 4 digits of their phone number to it.
    */
    Scanner scnr = new Scanner (System.in);
    System.out.println("Enter your first name: ");
    String firstName = scnr.next();
    
    System.out.println("Enter your phone number: ");
    String phoneNum = scnr.next();
    char n = firstName.charAt(0);
    String digits = phoneNum.substring (6, 10);
    System.out.println("Your ID is: " + n  + digits);
    
    /*
    2. The following pseudocode describes how to swap two letters in a word.

    Declare a string var str and initialize it to "JavaRocks"

    Prompt the user for two positions i and j between 0 & 8 inclusive. (i comes before j)

    Set first to the substring from the start of the string to the last position before i.

    Set middle to the substring from the letter after i to the letter before j.

    Set last to the substring from position after j to the end of the string.

    Concatenate the following five strings: first, the string containing just the

    character at position j, middle, the string containing just the character

    at position i, and last.
   

    */
			System.out.println("Enter two numbers in ascending order between 0 & 8)"
							+ "inclusive.");
			int i = scnr.nextInt();
			int j = scnr.nextInt();
			
			String str = "JavaRocks"; // 0-8
			String first = str.substring (0 , i);
			String middle = str.substring (i+1 , j);
			String last = str.substring (j+1 , str.length());
			
			String word = first + str.charAt (j) + middle + str.charAt(i) + last;
			System.out.println("After swapping two characters, the new word is: " +
							word);
				
    
			/*
			3. Convert the following pseudocode into Java:
			Prompt for the number of ounces of milk
			Compute the number of omelettes that can be made (4 ounces of milk per omelette)
			Use modulus division to determine the ounces of milk remaining
			Output the total number of omelettes that can be made
			Output the number of ounces remaining
			*/
			final int OZ_IN_OMELETTE =4;
			System.out.println("Enter the number of ounces of milk: ");
			int ounces = scnr.nextInt();
			
			int numOmelette = ounces / OZ_IN_OMELETTE;
			
			int ouncesRemaining = ounces % (OZ_IN_OMELETTE * numOmelette);
			
			System.out.println("You can make " + numOmelette + " omelettes.");
			System.out.println("You have " + ouncesRemaining + " ounces remaining");
			
    }
    
}