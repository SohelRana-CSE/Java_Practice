/*
 * Assignment-3 (User Input)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: get user input for each variables
* step 5: print the variables
 */


package assignment;

import java.util.Scanner;

public class ProductInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your id");
        int id = input.nextInt();
        System.out.println("ID: " +id);
        
        
        int num;
        Scanner input1 =new Scanner(System.in);
        num = input1.nextInt();
        System.out.println("Number is: " +num);
        
        
        
        Scanner tittle = new Scanner(System.in);
        System.out.println("Enter Tittle");
        String titt = tittle.nextLine();
        System.out.println("Tittle: " +titt);
        
        
        
        System.out.println("Enter Price");
        int price = input.nextInt();
        System.out.println("Price is: "+price);
        
        
        
        
        
        Scanner description = new Scanner(System.in);
        System.out.println("Enter Description");
        String des = description.nextLine();
        System.out.println("Description: " +des);
        
        

        
        
        Scanner category = new Scanner(System.in);
        System.out.println("Enter category");
        String cat = category.nextLine();
        System.out.println("Category: " +cat);
        
    }
}
