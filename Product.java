/*
 * Assignment-2 (Variable and Data type)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: assign the following data in main method
101,iphone15,1895 euros,perfect product with best image quality, phone,
* step 5: print the data
 */


package assignment;

public class Product {

    public static void main(String[] args) {
        
        int id = 101;
        String tittle = "iphone15";
        String price = "1895 euros";
        String description = "perfect product with best image quality";
        String category = "phone";
        
        
        System.out.println("ID: "+id);
        System.out.println("Tittle: "+tittle);
        System.out.println("Price: "+price);
        System.out.println("Description: "+description);
        System.out.println("Category: "+category);
    }
} 