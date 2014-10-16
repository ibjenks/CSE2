// Tyler Jenkins
// CSE002
// lab07
// Oct. 12th, 2014
//Root Application

// First compile the program
//          Root.java
// Run the program
//          java Root//

import java.util.Scanner; // imports java utility Scanner

// define a class
public class Root{
    
// add a method
    public static void main(String arg [] ) {
 
    Scanner myScanner = new Scanner(System.in); // intialize scanner variable myScanner to new scanner
    
    double x = 0; // intialize variable x
    
    
  while ( x <= 0) { // execute looop while x is less than or equal to 0
  System.out.println("Enter an double > 0"); // instruct user to enter a double greater than 0
  
  if (myScanner.hasNextDouble()){ // check to see if myScanner is a double
       
       x = myScanner.nextDouble(); // if true assign x to myScanner
   }
  
  else {                            // else print statement letting the user know they did not enter a double
      System.out.println("You did not enter a double");
      return; // terminate program
    }
  }
       
 double high = x+1, // intialize high to x+1
        low = 0, // intiliaze low to 0
        middle; // declare variable middle
        
    while ((high-low) >= (.0000001*(high)) ) { // while high - low is less than (.0000001*(high) run the loop
        
        middle= (high+low)/2; // assign middle to (high+low)/2
        
        if (middle*middle > (x)) { // if the square of middle is > x assign high to middle
            
                high = middle;
        }
        else {                      // else assign low to middle
            
            low = middle;
            }
        }
        double square = (low+high)/2; // initialize double square as  (low+high)/2
        
        System.out.println("Square root of "+x+": "+square); // print statement and variable x and square
        
    
    
        } // end main method
    }    // end class
 
 
 
 
 
 
    