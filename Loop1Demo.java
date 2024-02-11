// Print sum of all the numbers from 1 to 10

package basicjava;


public class Loop1Demo {
    public static void main(String[] args) {
        
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum +i;
        }
        System.out.println("Sum = " +sum);
    }
}
