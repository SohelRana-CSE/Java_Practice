// 1 + 2 + 3 + ..... + n

package basicjava;

import java.util.Scanner;


public class SeriesDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, sum = 0;
        
        System.out.print("Enter the last number: ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i = i+1) {
            System.out.print(i+ " " );
            sum = sum +i;
        }
        System.out.println();
        System.out.println("Sum = "+sum);
    }
}
