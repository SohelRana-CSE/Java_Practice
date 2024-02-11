
package basicjava;
import java.util.Scanner;

public class circleDemo {
    public static void main(String[] args) {
        double r, A;                            //r = radius,  A = area
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius:");
        r = input.nextDouble();
        
        A = 3.1416 * r;
        
        System.out.println("Area of Circle is = " +A);
    }
}
