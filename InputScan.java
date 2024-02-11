
package basicjava;

import java.util.Scanner;

public class InputScan {
    public static void main(String[] args) {
       
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        number = input.nextInt();
        System.out.println("Number = " +number);
        
 
        String name = "Sohel Rana";
        System.out.println("Name is :" +name);
       

        
        double num1;
        System.out.println("Enter any double value");
        num1 = input.nextDouble();
        System.out.println(num1);
        

        
        Scanner namee = new Scanner(System.in);
        String name1;
        System.out.println("Enter your name");
        name1 = namee.nextLine();
        System.out.println("Welcome: "+name1);
        
    }
} 
