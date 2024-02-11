
package basicjava;
import java.util.Scanner;

public class Temperature1 {
    public static void main(String[] args) {
        
        double celsius, fahrenheight;           // c = celsius, f = fahrenheight;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enetr Celsius: ");
        celsius = input.nextDouble();
        
        fahrenheight = 1.8 * celsius + 32;      // we know, F = 9/5 * C + 32;
        
        System.out.println("Fahrenheight is: " + fahrenheight);
    }
}
