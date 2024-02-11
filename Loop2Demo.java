// Print sum of all the numbers from m to n

package basicjava;

import java.util.Scanner;


public class Loop2Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        int m,n;
        
        System.out.println("Enter Initial Number: ");
        m = input.nextInt();
        
        System.out.println("Enter Final Number: ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            sum = sum +i;
        }
        System.out.println("Sum = " +sum);
    }
}
