
package basicjava;

public class AssignmentOperator {
    public static void main(String[] args) {
        
        int x = 3;
        int y = 2;
        
        x+=y;  // x = x+y = 5
        System.out.println("x = " +x);  //after calculate the x,then x value has been changed.
        
        x-=y;  // x = x-y = 3
        System.out.println("x = " +x);
        
        x*=y;  // x = x*y = 6
        System.out.println("x = " +x);
        
        x/=y;  // x = x/y = 3
        System.out.println("x = " +x);
        
        x%=y;  // x = x%y = 1
        System.out.println("x = " +x);
      
    }
}
