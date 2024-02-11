
package basicjava;


public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 32;
        int b = 12;
        int c;
                
        
        c = a & b;                              //bitwise AND
        System.out.println("a & b = " +c);
        
        c = a | b;                              //bitwise OR
        System.out.println("a | b = " +c);
        
        c = a ^ b;                              //bitwise EXOR
        System.out.println("a ^ b = " +c);
        
        
        c = a>>3;                               //bitwise RightShift
        System.out.println("a >> b = " +c);
        c = a<<3;                               //bitwise LeftShif
        System.out.println("a << b = " +c);
    }
}
