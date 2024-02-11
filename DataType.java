package basicjava;

public class DataType {
    public static void main(String[]args){
        
        boolean b;
        char c;
        byte bt = 15;
        short s = 25;
        int i = 1547923;
        float f = 10.2f;
        double d = 10.2;
                
        b = true;
        System.out.println(b);
        System.out.println("b = "+b);       
        
        c = 'a';
        System.out.println("c = " +c);
        
        System.out.println("bt = " +bt);      
        
        System.out.println("s = " +s);       
        
        System.out.println("i = " +i);
        
        System.out.println("f = " +f);

        System.out.println("d = " +d);
        
        
        
        System.out.printf("boolean b = %b\n",b);
        System.out.printf("character c = %c\n",c);
        System.out.printf("byte bt = %bt\n",bt);
        System.out.printf("short s = %s\n",s);
        System.out.printf("integer i = %d\n",i);
        System.out.printf("float f = %.2f\n",f);
        System.out.printf("double d = %.4f\n",d);
        
    }
}
