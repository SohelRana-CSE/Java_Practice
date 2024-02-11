// Print sum of all the even numbers from m to n


package basicjava;

import java.util.Scanner;


public class Loop3Demo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        int m,n;
        System.out.println("Enter Initial Number: ");
        m = input.nextInt();
        
        System.out.println("Enter Final Number: ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            if (i%2==0) {
                sum = sum +i;
                System.out.print(i+ "  ");
               
            }
            System.out.println("Sum of Even: " +sum);
            
        }
        
    }
}
