// Tyler Jenkins
// CSE002
// hw07
// Oct. 20th, 2014
//Number Stack Application

// First compile the program
//          NumberStack.java
// Run the program
//          java NumberStack//

import java.util.Scanner; // imports java utility Scanner

// define a class
public class NumberStack{
    
// add a method
    public static void main(String arg [] ) {
        Scanner myScanner = new Scanner(System.in);
        
        int counter1  = -1;
        int counter2 = 0;
        int number = 0;
        int i = 0;
        int x =0;
        
        
        while (counter1 > 9 || counter1 < 1){
         
        System.out.println("Enter an int between 1 and 9");
            while (!myScanner.hasNextInt()){
                myScanner.next();
                System.out.println("you did not enter an int, try again");
                
            }
        counter1 = myScanner.nextInt();
            
        }
        
        
       System.out.println("Using for loops:");
       
       for( x = 1; x < counter1+1; x++){ // gives number of times the inner loops should be executed
           
       
        for (number = 1; number < x+1; number++){ // gives the number of times the inner loops should be executed
           for (counter2 = 1; counter2 < counter1-x+1; counter2++){ // gives number of spaces needed
               System.out.print(" ");
           }
        
           
           for (int j = 0; j<(2*x-1); j++){ // gives number of times the number should be printed
               System.out.print(x); 
           }
           System.out.print("\n"); // prints a new line
        }
                for ( counter2 = 1; counter2<counter1-x+1; counter2++){ // gives number of spaces that need to be printed
             System.out.print(" "); 
       }
         for (int s = 0; s<(2*x-1); s++){ // gives number of dashes to be printed
             System.out.print("-");
         }
         System.out.print("\n"); // prints  new line
           
       }
         
      System.out.print("\n"); // prints new line
    
        
          int b = 0;
          int c = 0;
          int f = 0;
          int e = 0;
          int h = 0;
          int l = 0;
          System.out.println("Using while loops:");
          
          while (b<counter1+1){ // number of times innner loops are executed
              
              
              while(c<b){
                  
                  while(f<counter1-b){
                        System.out.print(" ");
                        f++;
                  }
                    while (e<(2*b-1)){
                        System.out.print(b);
                        e++;
                }
              e=0;
              f=0;
              c++;
              System.out.print("\n");
              }
              while (h<counter1-b){
                  System.out.print(" ");
                  h++;
              }
              
              while (l<(2*b-1)){
                  System.out.print("-");
                  l++;
              }
              System.out.print("\n");
              
              b++;
              c = 0;
              f = 0;
              h = 0;
              l = 0;
          }
          
          
          int b1 = 1;
          int c1 = 0;
          int e1 = 0;
          int f1 = 0;
          int h1 = 0;
          int l1 = 0;
          
          
          System.out.println("Using do-while loops:");
          
          do{
              do{
                  do{
                    System.out.print(" ");
                    f1++;
                      
                  } while (f1<counter1 - b1);
                    do{
                        System.out.print(b1);
                        e1++;
                        
                    } while (e1<(2*b1-1));
                 e1 = 0;
                 f1 = 0;
                 c1++;
                 System.out.print("\n");
                  } while (c1<b1);
                do{
                    System.out.print(" ");
                    h1++;
                    
                }  while (h1<counter1-b1);
                do {
                    System.out.print("-");
                    l1++;
                    
                } while (l1 < (2*b1-1));
                System.out.print("\n");
                b1++;
                c1 = 0;
                f1 = 0;
                h1 = 0;
                l1 = 0;
              } while (b1<counter1+1);
          
              
              
              
              
              
         
        
        
        
        
        
    }
}