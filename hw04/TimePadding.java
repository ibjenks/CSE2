// Tyler Jenkins
// CSE002
// hw04
// Sept. 23rd, 2014
// Time Padding Application

// First compile the program
//          TimePadding.java
// Run the program
//          java TimePadding//

import java.util.Scanner; // calls scanner

// define a class
public class TimePadding{
// add a main method    
    public static void main(String args []){
        Scanner myScanner = new Scanner(System.in);// allows user to enter input
        System.out.println("Enter the time in seconds"); // asks user to enter int
        
        int nSeconds = 0, // declaring int variables
            nMins = 0,
            nHours = 0,
            mPadded = 0,
            sPadded = 0;
        
        if (myScanner.hasNextInt()) { // checks if int is an int
            nSeconds = myScanner.nextInt();
        }
        else {
            System.out.println("You did not enter an int"); 
        }
        
        if (nSeconds > 0) { // checks if int is positive
            nMins = nSeconds/60; // calculates the amount of mins
            nHours = nMins/60; // calculates the amount of hours
            mPadded = (nHours % 100) / 10; // divides by 100 and gets remainder, then divides to get number of hours
            sPadded = (nMins * 1000) % 100 ;
            
            System.out.println(nHours+":"+mPadded+nMins%60+":"+sPadded+nSeconds%60); // prints time
        }
        else {
            System.out.println("You did not enter a positive int"); // if int is not positive print statement
        }
        

    }
}