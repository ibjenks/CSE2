// Tyler Jenkins
// CSE002
// hw03
// Sept. 14th, 2014
// Bicycle Calculations Application

// First compile the program
//          Bicycle.java

// Run the program
//          java Bicycle//

import java.util.Scanner;

// define a class
public class Bicycle{
// add a main method

    public static void main(String args [ ] ) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.println("Enter the cyclometer counts");
        int nCounts = myScanner.nextInt(); // gets number of counts
        
        System.out.println("Enter the number of seconds");
        double nSeconds = myScanner.nextDouble(); // gets number of seconds for the counts
        
        
        // declare constants
         double PI = 3.14159;
         int wheelDiameter = 27,
             feetPerMile = 5280,
             inchesPerFoot = 12,
             secondsPerMinute = 60;
        
        double distanceTrip = (nCounts*wheelDiameter*PI)/inchesPerFoot/feetPerMile; // calculates the distance traveled
               distanceTrip = distanceTrip*100;
               distanceTrip = (double)((int) distanceTrip);
               distanceTrip = distanceTrip/100; // converts the double to int and back to double with 2 decimals places
               
        double tripLength = nSeconds/secondsPerMinute; // calculates the amount of time in mins
               
        double milesPerHour = secondsPerMinute/tripLength*distanceTrip; // calculates avg mph
               milesPerHour = milesPerHour*100;
               milesPerHour = (double)((int) milesPerHour);
               milesPerHour = milesPerHour/100;
        
// print out results here

        System.out.println("The distance was "+distanceTrip+" miles and took "+tripLength+" minutes.");
        System.out.println("The average mph was "+milesPerHour);
        
    }
}