// Tyler Jenkins
// CSE002
// hw04
// Sept. 23rd, 2014
// Income Tax Application

// First compile the program
//          IncomeTax.java
// Run the program
//          java IncomeTax//

import java.util.Scanner; //importing java utility scanner

// define a class
public class IncomeTax{
    
// Add a method
    public static void main(String args []){
        
        
        Scanner myScanner = new Scanner (System.in); // declare scanner variable
        System.out.println("Enter an integer giving the number of thousands"); //print out statement
        
       int thousands = 0; // declaring thousands as an int
        
        
        if (myScanner.hasNextInt()){
            thousands = myScanner.nextInt();
        }                                       // if myScanner is an int then thousands = myScaner
        
        else {
            System.out.println("You did not enter an int"); // if no int is entered
            return; // terminates and returns to beginning
        }
        
        double  fiveRate = .05, // declare all the taxrate variables
                sevRate = .07,
                twelveRate = .12,
                fortRate = .14,
                taxRate, incomeThousands;
                
                incomeThousands = thousands*1000; // set value for int in thousands
                
        if (thousands >= 78)  {
            taxRate = incomeThousands*fortRate;
            System.out.println("The tax rate on "+"$"+thousands+",000 is 14%, and the tax is " + taxRate); // if int >= 78 then tr = 14%
        }      
        else if (thousands >= 40) {
            taxRate = incomeThousands*twelveRate;
            System.out.println("The tax rate on "+"$"+thousands+",000 is 12%, and the tax is " + taxRate); // if int >= 40 then tr = 12%
        }      
        }     
        
        else if (thousands >= 20) {
            taxRate = incomeThousands*sevRate;
            System.out.println("The tax rate on "+"$"+thousands+",000 is 7%, and the tax is " + taxRate); // if int >= 20 then tr = 7%
        }      
        }
        
        else if (thousands >= 0) {
            taxRate = incomeThousands*fiveRate;
            System.out.println("The tax rate on "+"$"+thousands+",000 is 5%, and the tax is " + taxRate); // if int >= 0 then tr = 5%
        }      
        }
        
        else {
            System.out.println("you did not enter a positive int"); // if int !=> 0 
        return; // terminate program and return to begin
            
        }
    }
}