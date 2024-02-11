// 1.5 + 2.5 + 3.5 + ..... + n

package basicjava;

import java.util.Scanner;

public class SeriesDemo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double n, sum = 0;
        
        System.out.println("Enter the last number");
        n = input.nextDouble();
        double i;
        
        for ( i = 1.5; i <= n; i = i+1) {
            System.out.print(i+ " " );
            sum = sum + i * i;
        }
        System.out.println();
        System.out.println("Sum = "+sum);
    }
}
