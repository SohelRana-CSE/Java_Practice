
package basicjava;
import java.util.Scanner;

public class HowToScan {
    
    
    public static void main(String [] args){

    Scanner scr = new Scanner(System.in);
    System.out.println("Enter A Number: ");
    int a = scr.nextInt();
    System.out.println("Enter Another Number: ");
    int b = scr.nextInt();
    
    
    int result = a+b;
    System.out.println("The result= " +result);
    }
}
