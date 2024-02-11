package practicewithk;
import java.util.Scanner

public class FahToCel {
    public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter Fahrenheight value: ");
    float F = in.nextFloat();
    
    float C = 5/9 * (F-32);
    System.out.println(C + " Degree Celsius. ");
    }
}