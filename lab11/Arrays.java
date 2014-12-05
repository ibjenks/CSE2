// Tyler Jenkins
// CSE002
// lab11
// Nov. 12th, 2014
//Arrays Application

// First compile the program
//          Arrays.java
// Run the program
//          java Arrays//

import java.util.Scanner; // imports java utility Scanner

// define a class
public class Arrays{
    
    public static void flip(int[] list){
        int i = 0;
        for(i = 0; i<list.length/2; i++){
            int temp = list[i];
            list[i] = list[list.length-1-i];
            list[list.length-1-i] = temp;
        }
    }
    
    
    
    public static int flip2(int a){
       int x = 9-a;
       return x;
    }
    
    
    public static void main(String [] args){
        
       Scanner scan = new Scanner (System.in);
       
       System.out.println("enter 10 ints :");
       
        int[] list = new int[10];
        
        
        for(int i = 0; i<10; i++){
            list[i] = scan.nextInt();
        }
        
      //  flip(list);
        
        for (int x = 0; x <10; x++){
            System.out.println(list[x]);
            for (int j=0; j <10; j++ ){
            int k = flip2(j);
            System.out.print(list[k]);
            }
            
        }
        
        
        
        
    }
}    