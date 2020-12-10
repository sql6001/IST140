import java.util.Scanner;

/**
 *
 * @author shish
 */
public class Unit3InClassAssignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
    The following algorithm yields the season (Spring, Summer, Fall, or Winter) 
    for an month and day.
        
    If month is 1, 2, or 3, season = "Winter"
    Else if month is 4, 5, or 6, season = "Spring"
    Else if month is 7, 8, or 9, season = "Summer"
    Else if month is 10, 11, or 12, season = "Fall"
    If month is divisible by 3 and day >= 21
    If season is "Winter", season = "Spring"
    Else if season is "Spring", season = "Summer"
    Else if season is "Summer", season = "Fall"
    Else season = "Winter"

    Write a program that prompts the user for a month
    and day and then prints the season, as determined
    by this algorithm.
    */
    
        Scanner scnr = new Scanner (System.in);
        System.out.println ("Enter a month (1-12) and day (1-31): ");
        int month = scnr.nextInt();
        int day = scnr.nextInt();
        
        String season = "";
        /*
        if ((month==1) || (month==2) || (month==3) || (month==4))
        {
            season = "Winter";
        }
        else if ((month==4) || (month==5) || (month==6))
        {
            season = "Spring";
        }
        else if ((month==7) || (month==8) || (month==9))
        {
            season = "Summer";
        }
        else if ((month==10) || (month==11) || (month==12))
        {
            season = "Fall";
        }
        else
        {
            season = "Fall";
        }
        */
        
        switch (month)
        {
            case 1: season  = "Winter"; break;
            case 2: season  = "Winter"; break;
            case 3: season  = "Winter"; break;
            case 4: season  = "Spring"; break;
            case 5: season  = "Spring"; break;
            case 6: season  = "Spring"; break;
            case 7: season  = "Summer"; break;
            case 8: season  = "Summer"; break;
            case 9: season  = "Summer"; break;
            case 10: season  = "Fall"; break;
            case 11: season  = "Fall"; break;
            case 12: season  = "Fall"; break;
            default: season = "Fall"; break;
        }   
        
        
        if ((month % 3 == 0) && (day >= 21))
        {
            if (season.equals("Winter")) //use .equals when comparing strings
            {
                season = "Spring";
            }
            else if (season.equals("Spring"))
            {
                season = "Summer";
            }
            else if (season.equals("Summer"))
            {
                season = "Fall";
            }
            else if (season.equals("Fall"))
            {
                season = "Winter";
            }
            else
            {
                season = "Winter";
            }
            
            System.out.println("The season is: " + season);
        }
            
        
        
        
    }
    
    
}
