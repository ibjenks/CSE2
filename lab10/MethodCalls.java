// Tyler Jenkins
// CSE002
// lab09
// Oct. 24th, 2014
//Method Calls Application

// First compile the program
//          MethodCalls.java
// Run the program
//          java MethodCalls//

import java.util.Scanner; // imports java utility Scanner

// define a class
public class MethodCalls{
    
    
    public static int addDigit(int a, int b){
        String x = "";
        int y;
        int z;
        int w;
        
        if (a < 0){
                z = a*-1;
                String number = Integer.toString(b);
            String multiplier = Integer.toString(z);
            x = number+multiplier;
            
            y = Integer.parseInt(x);
            w = y*-1;
            
            return w;
            }
           
            String number = Integer.toString(b);
            String multiplier = Integer.toString(a);
            x = number+multiplier;
            
            y = Integer.parseInt(x);
            
            
            
            return y;
}
    
    public static int join(int a, int b){
        int x;
        
        if (a<0 && b<0){
            a = a*-1;
            b = b*-1;
            x = addDigit(b,a);

        }
         x = addDigit(b,a);
         return x;
    }
    
    
    
    
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
}  
