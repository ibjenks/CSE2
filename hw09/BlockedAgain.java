// Tyler Jenkins
// CSE002
// hw09
// Nov. 3rd, 2014
//Blocked Again Application

// First compile the program
//          BlockedAgain.java
// Run the program
//          java BlockedAgain//

import java.util.Scanner; // imports java utility Scanner
// define a class
public class BlockedAgain{

    public static int getInt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an int between 1-9");
    
    while(!checkInt(scan)){
			scan.next();
			System.out.println("You did not enter an int; try again");
		}
        
        return checkRange(scan,scan.nextInt());
        
        
        
       
    }    


    public static boolean checkInt(Scanner a){
        
        a.hasNextInt();
        return true;
    }
    
    
    public static int checkRange(Scanner a, int test){
        
        if(test > 0 && test < 10){
            return test;
            
        }
        else{ 
            System.out.println("You did not enter an int in [1,9], try again");
			while(!checkInt(a)){
			a.next();
			System.out.println("You did not enter an int; try again");
			}
			return checkRange(a,a.nextInt());
        }
    }




    public static void allBlocks(int a){
        block(a);
        
    }


    public static void block (int a){
        int counter2;
        int x;
        
        for( x = 1; x < a+1; x++){ // gives number of times the inner loops should be executed
           
       
        for (int number = 1; number < x+1; number++){ // gives the number of times the inner loops should be executed
           for ( counter2 = 1; counter2 < a-x+1; counter2++){ // gives number of spaces needed
               System.out.print(" ");
           }
        
           
           for (int j = 0; j<(2*x-1); j++){ // gives number of times the number should be printed
               System.out.print(x); 
           }
           System.out.print("\n"); // prints a new line
        }
               line(a); // prints  new line
           
       }
    }
    
    public static void line(int b){
         int x=5;
         
         for (int counter2 = 1; counter2<b-x+1; counter2++){ // gives number of spaces that need to be printed
             System.out.print(" "); 
       }
         for (int s = 0; s<(2*x-1); s++){ // gives number of dashes to be printed
             System.out.print("-");
         }
         System.out.print("\n");
    }







// declare a main method
    public static void main(String []s){
int m;
//force user to enter int in range 1-9, inclusive.
m = getInt(); 
allBlocks(m);
    }
    
}
