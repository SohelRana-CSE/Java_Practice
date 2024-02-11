
package basicjava;

import java.util.Scanner;

public class VowelConsonantDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter: ");
        ch = input.next().charAt(0);   //for get single charecter we use charAt(0);
        
        
        if(ch=='a'){
            System.out.println("Vowel");
        }
        else if(ch=='e'){
            System.out.println("Vowel");
        }
        else if(ch=='i'){
            System.out.println("Vowel");
        }
        else if(ch=='o'){
            System.out.println("Vowel");
        }
        else if(ch=='u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
        
    }
}

        
        /* for switch case
        
                switch (ch) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
        */
        
  