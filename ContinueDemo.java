
package basicjava;

public class ContinueDemo {
    public static void main(String[] args) {
        
        for(int i=1; i<=100; i= i+3){
            
            if(i==10){
                continue;   //when i=10 then go to loop section to find the i's new value. 
            }
            
            if(i>13){
                break;      //when i>13, then break the loop & not print any number that is greater than 13.  
            }
            System.out.println(i);
        }
    }
}
