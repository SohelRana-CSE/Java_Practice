
package basicjava;

import java.util.Scanner;

public class timeTableNestedLoopDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n;
        System.out.print("Please First Number: ");
        m = input.nextInt();
        System.out.print("Please Final Number: ");
        n = input.nextInt();
        
        
        for (int i = m; i <= n; i++) {
            
            for (int j = 1; j <= 10; j++) {
            
            System.out.println(i + " X " +j  + " = " +i * j);
        }
            System.out.println("\n\n");
        }
        
        
    }
}
