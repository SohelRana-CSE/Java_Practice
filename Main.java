import java.util.Random;

public class Main {
	public static void main(String []args) {
		
		System.out.println("Hello World"); 
		
		//Comment
		// This is a comment, comment can be used by using //.
		
		//Variables 
		int myNum = 15;
		myNum = 20;
		System.out.println(myNum);
		
		//Types of Variables
		int a = 5;
		double b = 5.0;
		char c = 'A';
		boolean d = true; //Can be used as flag
		String e = "Hello";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
//		//Type Casting
		int myMark = 10;
		double myUpdatedMark = myMark;
		System.out.println(myMark);
		System.out.println(myUpdatedMark);
		
		//Operators +-*/
		int num01 = 1;
		int num02 = 1;
		int sum = num01 + num02;
		System.out.println(sum);
		System.out.println(Math.random());
		
		// Generate random integers in range 0 to 10 
        Random rand = new Random();
		int rand_int1 = rand.nextInt(7);  
        // Print random integers 
        System.out.println("\n Random Integers: "+rand_int1); 
    
		//String Operations
		String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("\nThe length of the string is: "+ text.length());
		System.out.println(text.toLowerCase());

		//Conditional Statements
		int x = 1;
		int y = 2;
		if (x>y) {
			System.out.println("X is greater than Y");
		}else {
			System.out.println("X is smaller than Y");
		}
		
//		//While Loop
		int i = 0;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
//		
//		//For Loop
		for(int num=0; num<5; num++) {
			System.out.println(num);
		}
	}
}