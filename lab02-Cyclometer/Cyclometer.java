// Tyler Jenkins
//CSE002
// lab 2
// Sept. 3th, 2014
// Cyclometer Application

//  First compile the program
//      Cyclometer.java
//  Run the program
//      java Cyclometer//

//      define a class
        public class Cyclometer{
           
//      add main method         
            public static void main(String [] args){
                int secsTrip1=480; // Number of seconds trip 1 took
                int secsTrip2=3220; // Number of seconds trip 2 took
                int countsTrip1=1561; // Number of counts for trip 1
                int countsTrip2=9037; // Number of counts for trip 2
                double wheelDiameter=27.0, // constant diameter of the wheel
                PI=3.14159, // the constant pi
                feetPerMile=5280, // constant feet per mile
                inchesPerFoot=12, // constant inches per foot
                secondsPerMinute=60; // constant seconds per minute
                double distanceTrip1, distanceTrip2,totalDistance;
                
                System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+
                countsTrip1+" counts.");
                System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute) +" minutes and had "+
                countsTrip2+" counts.");
                distanceTrip1=countsTrip1*wheelDiameter*PI;
                // Above gives the distance in inches
                // (For each count, a rotation of the wheel travels
                // the diameter in inches time PI)
                distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
                distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
                totalDistance=distanceTrip1+distanceTrip2;
                System.out.println("Trip 1 was "+distanceTrip1+" miles");
                System.out.println("Trip 2 was "+distanceTrip2+" miles");
                System.out.println("The total distance was "+totalDistance+" miles");
                
                
            } // end main method
        } // end class
        
        