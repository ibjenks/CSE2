// Tyler Jenkins
// CSE 002
// hw03
// Sept. 15th, 2014
// Root Application

// First compile the program
//      Root.java

// Then run the program
//      java Root //

import java.util.Scanner;

// define a class
    public class Root{
    
// create a method
        public static void main(String args[ ] ){
            Scanner myScanner; // declare scanner variable
            myScanner = new Scanner (System.in);
            System.out.println("Enter a double value");
            double x = myScanner.nextDouble(); // declare variable that scanner gives
            
            double guess = x/3; // calculates crude guess
            guess = (2*guess*guess*guess+x)/(3*guess*guess);
            guess = (2*guess*guess*guess+x)/(3*guess*guess);
            guess = (2*guess*guess*guess+x)/(3*guess*guess);
            guess = (2*guess*guess*guess+x)/(3*guess*guess);
            guess = (2*guess*guess*guess+x)/(3*guess*guess);
            
            System.out.println("The cube root is " + guess+" : "+guess+" * "+guess+" * "+guess+" = "+ (guess*guess*guess)); // print out results
            
            
            
        }
    }