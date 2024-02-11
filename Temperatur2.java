
package basicjava;

import java.util.Scanner;

public class Temperatur2 {
    public static void main(String[] args) {
        
        double celsius, fahrenheight;
        
        System.out.println("Enter Fahrenheight: ");
        
        Scanner input = new Scanner(System.in);
        fahrenheight = input.nextDouble();

        celsius = 0.555 * (fahrenheight - 32);             // C = 5/9 * (F-32)
        System.out.println("Celsius is = " +celsius);
            
        
    }    
}
