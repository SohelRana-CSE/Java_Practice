
package basicjava;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        
        float base;
        float height, result;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base:");
        base = input.nextFloat();
        System.out.print("Enter height:");
        height = input.nextFloat();
        
        result = (float) (0.5 * base * height);
        
        System.out.println("Result is: " +result);
        
    }
}
