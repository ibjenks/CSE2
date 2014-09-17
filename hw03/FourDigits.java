// Tyler Jenkins
// CSE002
// Sept. 15th, 2014
// hw03
//Four Digits Application

// First compile the program
//      FourDigits.java

// run the program
//      java FourDigits

 import java.util.Scanner;
//define a class

    public class FourDigits{

// add a main method

        public static void main(String args [] ){
            
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            System.out.println("Enter a double and I print out the last four digits to the right of the decimal");
            double x = myScanner.nextDouble(); //allows user to enter a double
            
            int nDigit1 = (int)(x*10000); // multiply by 10000 and then convert x to int
                nDigit1 = nDigit1 % 10; // gives fourth digit after decimal
                
            int nDigit2 = (int)(x*10000); // multiply by 10000 then convert x t int
                nDigit2 = nDigit2 % 100; // gives third and fourth digit
                nDigit2 = (int) (nDigit2/10); // gives only third digit
                
            int nDigit3 = (int)(x*10000); // multiply by 10000 then convert x t int
                nDigit3 = nDigit3 % 1000; // gives 2nd, third, and fourth digit
                nDigit3 = (int) (nDigit3/100); // gives only 2nd digit
                
            int nDigit4 = (int)(x*10000); // multiply by 10000 then convert x t int
                nDigit4 = (int) nDigit4 % 10000; // gives 1st, 2nd, 3rd, 4th digit
                nDigit4 = (int) (nDigit4/1000); // gives only 4th digit
           
            
            System.out.println("The four digits are " +nDigit4+nDigit3+nDigit2+nDigit1);
            
     
     
        }
     
        
    }