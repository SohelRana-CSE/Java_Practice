
package basicjava;

public class UnaryIncrementDecrement {
    public static void main(String[] args) {
        
        int x = 25;
        int y;
        
        y = ++x;            //prefix inrecrement
        System.out.println("prefix inrecrement y = "+y);
        y= x;
        System.out.println("prefix inrecrement y = "+y);
        
        
        y = x++;            //postfix increement
        System.out.println("postfix inrecrement y = " +y); 

        y = x;
        System.out.println("postfix inrecrement y = " +y);
        
        
        
        
        
        y = --x;            //prefix decrecrement
        System.out.println("prefix decrecrement y = "+y);
        y= x;
        System.out.println("prefix decrecrement y = "+y);
        
        
        y = x--;            //postfix decreement
        System.out.println("postfix decrecrement y = " +y);

        y = x;
        System.out.println("postfix decrecrement y = " +y);
        
        
    }
}
