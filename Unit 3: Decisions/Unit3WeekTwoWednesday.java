import java.util.Scanner;

/**
 *
 * @author shish
 */
public class Unit3WeekTwoWednesday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
    Write a program that reads a temperature value and the letter C for
    Celsius or F for Fahrenheit. Print whether water is liquid, solid, or
    gaseous at the given temperature at sea level.
    */
    
    /*
    Celsius:
    The gas state - temp has to be > 100
    Liquid state - temp > 0 
    
    Fahrenheit:
    gas state - temp > 212
    liquid state - temp > 32
    */
    
    final double GAS_STATE_CELCIUS = 100;
    final double LIQUID_STATE_CELCIUS = 0;
    final double GAS_STATE_FAHRENHEIT = 212;
    final double LIQUID_STATE_FAHRENHEIT = 32;
    boolean flag = false;
    double temp = 0;
    String letter = "";
    
    Scanner scnr = new Scanner (System.in);
    System.out.println("Enter temperature: ");
    if (scnr.hasNextDouble())
    {
        temp = scnr.nextDouble();
    }
    else
    {
        flag = true;
    }
    
    System.out.println("Enter C for Celsius or F for Fahrenheit: ");
    if (scnr.hasNext())
    {
        letter = scnr.next();
    }
    else
    {
        flag = true;
    }
    
    if (flag == true)
    {
        System.out.println("Invalid Entry");
    }
    else
    {
        //if (letter.equals ("C"))
        if (letter.compareTo("C")==0)
        {
            if (temp > GAS_STATE_CELCIUS)
            {
                System.out.println("It is a gas.");
            }
            else if (temp > LIQUID_STATE_CELCIUS)
            {
                System.out.println("It is a liquid.");
            }
            else 
            {
                System.out.println("It is a solid.");
            }
        }
        // else if (letter.equals("F
        else if (letter.compareTo("F")==0)
        {
            if (temp > GAS_STATE_FAHRENHEIT )
            {
                System.out.println("It is a gas.");
            }
            else if (temp > LIQUID_STATE_FAHRENHEIT)
            {
                System.out.println("It is a liquid,");
            }
            else 
            {
                System.out.println("It is a solid.");
            }
        }
        else
        {
            System.out.println("Invalid Entry");
        }
    }
    }
    
}