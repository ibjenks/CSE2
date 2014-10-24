// Tyler Jenkins
// CSE002
// lab07
// Oct. 10th, 2014
//Loop The Loop Application

// First compile the program
//          LoopTheLoop.java
// Run the program
//          java LoopTheLoop//

import java.util.Scanner; // imports java utility Scanner

// define a class
public class LoopTheLoop{
    
// add a method
    public static void main(String arg [] ) {
        Scanner myScanner = new Scanner(System.in);
        int counter = 1;
        int y = 0;
        int nStars = -1;
        int x = 0;
        
      
       
       while (true){
       
       while (nStars > 15 || nStars < 1){
         
        System.out.println("Enter an int between 1 and 9");
            while (!myScanner.hasNextInt()){
                myScanner.next();
                System.out.println("you did not enter an int, try again");
                
            }
            
        nStars = myScanner.nextInt();
           
        }
        
        for(x=0; x<nStars; x++){
            System.out.print("*");
        }
        
        System.out.println("");
       
       
       
       while(counter <= nStars){
           System.out.println("*");
           counter++;
           y=1;
           while (y < counter){
               y++;
               if (counter == nStars+1){
                   break;
               
               }
               
              System.out.print("*");
               
           }
       }
       
       
        System.out.println("\n");
            
            
            
            
             
           System.out.println("enter Y or y to go again");
            String answer = myScanner.next();
            
            
            if (answer.equals("y") || answer.equals("Y")){
                nStars = -1;
                counter = 1;
                continue;
            }
            else{
                break;
                }
            }
    
       
    }
}
      

        
      
      
      
        
        
    
        
        

