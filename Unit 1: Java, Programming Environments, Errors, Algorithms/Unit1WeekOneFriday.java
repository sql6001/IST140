import java.util.Scanner;
public class Unit1WeekOneFriday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* 
        write a program that prints the balance of an account after the 
        first, second and third year. The acccount has an initial balance of 
        $1000 and earns 5% interest per year
       */
       
        System.out.print("Balance after year 1 = $");
        System.out.println(1000 * 1.05);
        System.out.print("Balance after year 2 = $");
        System.out.println(1000 * 1.05 * 1.05);
        System.out.print("Balance after year 3 = $");
        System.out.println(1000 * 1.05 * 1.05 * 1.05);
        
        /*
        same problem but get user input on balance
        */
        
       Scanner scnr = new Scanner(System.in); //Create Scanner object
       double balance = 0;
        
       System.out.println("Enter your beginning balance: ");//prompt
       balance = scnr.nextDouble(); //read user input into balance
        
       System.out.print("Balance after year 1 = $");
       System.out.println(balance * 1.05);
       System.out.print("Balance after year 2 = $");
       System.out.println(balance * 1.05 * 1.05);
       System.out.print("Balance after year 3 = $");
       System.out.println(balance * 1.05 * 1.05 * 1.05);
    }
    
}