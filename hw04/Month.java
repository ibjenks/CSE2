// Tyler Jenkins
// CSE002
// hw04
// Sept. 23rd, 2014
// Math Application

// First compile the program
//          Month.java
// Run the program
//          java Month//

import java.util.Scanner; // imports java utility Scanner

// define a class
public class Month{
    
// add a method
    public static void main(String args [] ) {
        
        int month = 0, // declares month as int
            year = 0,
            yearRemainder = 0;
        Scanner myScanner = new Scanner (System.in); // declares scanner variable
        System.out.println("Enter an int giving the number of month"); // asks user to enter an int
        
        
        
            if (myScanner.hasNextInt()){
            month = myScanner.nextInt(); // if myScanner is int then store myScanner in month
             }
             else {
            System.out.println("You did not enter an int"); // if no int in entered print statement
             }
             
             
             if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                 System.out.println("This month has 31 days."); // if month == 1,3,5,7,8,10, or 12 then print statement
             }
             else if ( month == 4 || month == 6 || month == 9 || month == 11){
                 System.out.println("This month has 30 days."); // if month == 4,6,9,11 then print statement
             }
             else if (month == 2){
                System.out.println("Enter the year"); //if the month is 2, enter the year
                year = myScanner.nextInt();
                    
                    if (year >0){ // if the year is positive execute code
                        year = year%4;
                            if (year == 0){ // if remainder is 0 then month has 28 days
                                System.out.println("This month has 28 days.");
                            }
                            else {
                                System.out.println("This month has 29 days"); // if remainder is anything but 0 then month has 29 days
                     }       
                   }
                else {
                System.out.println("You did not enter a positive int or an int that is month of the year."); // if number is not positive print statement
                        
                }        // end else
                    
             }// end else if
             else if (month < 0){ // checks if int is positive
                 System.out.println("You did not enter a positive int");
             }
             else {
                 System.out.println("You did not enter a legitimate month"); // if int isnt a number corresponding with a month
             }
    } // end method
} // end class
