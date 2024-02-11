
package basicjava;

import java.util.Scanner;


public class ifElseDemo {
    public static void main(String[] args) {
        
        int num;
        System.out.println("Enter any integer: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        
        
        if (num>0){
            System.out.println("Positive");
        }
        else if(num<0) {
            System.out.println("Negative");
        }
        else{
            System.out.println("Equal To Zero");
        }
        
        
    }
}
