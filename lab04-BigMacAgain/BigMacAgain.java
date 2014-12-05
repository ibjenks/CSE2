// Tyler Jenkins
// CSE002
// lab04
// Sept. 19th, 2014
// Big Mac Application

// First compile the program
//          BigMacAgain.java
// Run the program
//          java BigMacAgain//

import java.util.Scanner;

// define a class
public class BigMacAgain{

// add a main method
    public static void main(String args[ ] ){
         
         
         double costBigMac = 2.22;
         double costFries = 2.15;
         
         Scanner myScanner; 
        myScanner = new Scanner(System.in);
         System.out.println("Enter the number of Big Macs:");
         
        
       
        int nBigMacs = myScanner.nextInt();
       
        
        
        
        if (myScanner.hasNextInt()) {
            System.out.println("You have ordered "+nBigMacs+" for the cost of "+nBigMacs+"*"+costBigMac+" = "+nBigMacs*costBigMac);
        } 
        
        else {
            System.out.println("You did not enter an integer.");
            return;
        }
    
        if (myScanner.hasNextInt() < 0) {
            System.out.println("Your integer was less than 0");
            return;
        }
        
        myScanner = new Scanner(System.in);
        System.out.println("Do you want an order of fries?");
         
         String fries = myScanner.next();
         
         
         switch (fries) {
             
             case "Y":
             case "y":
                 
                 System.out.println("You ordered fries at a cost of $"+costFries);
                 System.out.println("The total cost of your meal = "+(costFries+(costBigMac*nBigMacs)));
                 break;
             
             case "N":
             case "n":
                 System.out.println("The total cost of your meal = "+(nBigMacs*costBigMac));
                 break;
                 
             default:
            System.out.println("You did not enter a correct letter");
                break;
         }
         
         
        
    } //end main method
} //end class
