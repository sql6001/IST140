import java.util.Scanner;

/**
 *
 * @author shish
 */
public class Unit2WeekTwoMonday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        R 2.19 The following pseudocode describes how to obtain the name of a 
        day, given the day
        number (0 = Sunday, 1 = Monday, and so on.)


        1. Declare a string called names containing "SunMonTueWedThuFriSat".
        2. Compute the starting position as 3 x the day number.
        3. Extract the substring of names at the starting position with length 3.
        */
        
       String names = "SunMonTueWedThuFriSat";
       Scanner scnr = new Scanner(System.in);
       System.out.println("Enter the day (0-6): ");
       int dayNumber = scnr.nextInt();
        
       int startPos = 3 * dayNumber;
       String day = names.substring(startPos, startPos + 3);
       
       System.out.println("the day is: " + day);
       
       /*
       R 2.21 How do you get the first character of a string? The last character?
       How do you remove the first character? The last character?
       */
       int length = names.length();
       char firstChar = names.charAt(0);
       char lastChar = names.charAt(length - 1);
       
       
       String namesRemoveFirstChar = names.substring(1);
       String namesRemoveLastChar = names.substring (0, length -1);
       
       System.out.println("First character: " + firstChar + "\nLast char: " +
               lastChar + "\nRemove first char: " + namesRemoveFirstChar + 
               "\nRemvoe last char: " + namesRemoveLastChar);
                       
             
    
    }
    
}