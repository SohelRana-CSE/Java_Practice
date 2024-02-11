// 2 + 4 + 6 + 8 + ..... + n

package basicjava;

import java.util.Scanner;

public class SeriesDemo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, sum = 0;
        
        System.out.println("Enter the last number");
        n = input.nextInt();
        
        for (int i = 2; i <= n; i = i+2) {
            System.out.print(i+ " " );              //print to show all the number
            sum = sum +i;
        }
        System.out.println();
        System.out.println("Sum = "+sum);
    }
}
