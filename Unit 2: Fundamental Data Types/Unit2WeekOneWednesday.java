public class Unit2WeekOneWednesday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
    1.  Write a code snippet of the dimensions of a letter sized sheet of paper
        Dimensions = 8.5 x 11 inches
        Convert to mm
        25.4mm per inch
    */

    //declaring variable
    final double MM_PER_IN = 25.4;
    final double WIDTHIN = 8.5;
    final double LENGTHIN = 11.0;
    
    //conversion
    double widthMM = WIDTHIN * MM_PER_IN;
    double lengthMM = LENGTHIN * MM_PER_IN;
    
    //unformatted output
    System.out.println("The paper width in MM is: " + widthMM);
    System.out.println("The paper length in MM is: " + lengthMM);
    
    //formatted output
    System.out.printf("The paper width in MM is: %.1f%n" , widthMM );
    System.out.printf("The paper length in MM is: %.1f%n", lengthMM);
    
 

    /*
    2. Write a code snippet that computes and displays the perimeter of a 
        letter-sized (8.5 x 11)
        sheet of paper and then length of its diagonal.
    */
    
    double perimeter = 2*WIDTHIN + 2*LENGTHIN;
    
    /*
    Pyhagorean Theorem
    A^2 + B^2 = C^2
    */
    final double A = 8.5;
    final double B = 11.0;
    final double C = Math.sqrt ((A * A) + (B * B));
    
    System.out.printf("The length of the diagonal is: %.1f%n" , C);
    
    }
    
}