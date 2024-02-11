import java.util.random;
public class Random {
    public static void main(String []args) {	
                
        Random rand = new Random();
	int rand_int1 = rand.nextInt(10);  
        // Print random integers 
        System.out.println("Random Integers: "+rand_int1); 
    }
}