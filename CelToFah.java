
package practicewithk;
import java.util.Scanner

public class CelToFah {
    public static void main(String [] args){
        
    Scanner in = new Scanner(System.in);
   
    System.out.println("Enter Celsius value: ");
    float C = in.nextFloat();
    
    float F = C * (9f/5) +32;
    System.out.println(F + " Degree Fahrenheight. ");
    }
}
