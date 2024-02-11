
package basicjava;

import java.util.Scanner;


public class CapitalSmallDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter any charecter");
        ch = input.next().charAt(0);
        
        if(ch>='a' && ch<='z'){                         //a-z
            System.out.println("Small Letter");
        }
        else if(ch>='A' && ch<='Z'){                                           //A-Z
            System.out.println("Capital Letter");
        }
        else{
            System.out.println("Not a letter");
        }
    }
}
