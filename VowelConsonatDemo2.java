
package basicjava;

import java.util.Scanner;


public class VowelConsonatDemo2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter any charecter");
        ch = input.next().charAt(0);
        
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){            //use logical operator = logical OR;
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonat");
        }
       
    }
}
