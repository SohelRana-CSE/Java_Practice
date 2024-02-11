
package basicjava;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        
        int num1, num2, result;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        num1 = input.nextInt();
          
        System.out.println("Enter another number: ");
        num2 = input.nextInt();
        
        
        result = num1 + num2;
        System.out.println("Addition: " +result);
        
        result = num1 - num2;
        System.out.println("Sub: " +result);
        
        result = num1 * num2;
        System.out.println("Mul: " +result);
        
        
        
        double result2 = (double) num1 / num2;            // double used for type casting.
        System.out.println("Div: " +result2);
        
        result = num1 % num2;
        System.out.println("Reminder: " +result);
        
        
        
    }
}
