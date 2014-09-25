// Tyler Jenkins
// CSE002
// hw04
// Sept. 23rd, 2014
// Course Number Application

// First compile the program
//          CourseNumber.java
// Run the program
//          java CourseNumber//

import java.util.Scanner;

// define a class
    public class CourseNumber{
        
// add a main method
        public static void main(String args [] ){
            
            int enteredNumber = 0,
                firstFour = 0, lastTwo = 0;
            
            
            Scanner myScanner = new Scanner (System.in);
            System.out.println("Enter a 6 digit number giving the course semester.");
            
            if (myScanner.hasNextInt()) {
                enteredNumber = myScanner.nextInt();
                
            }
            else {
                System.out.println("You did not enter an int");
            }
            
            
            
            
            
            
            if (enteredNumber >= 186510 && enteredNumber <= 201440) {
                firstFour = enteredNumber / 100;
                lastTwo = enteredNumber%100;
            }
            else {
                System.out.println("You didn't enter a number between the ranges of [186510,201440].");
            }
            
            if (lastTwo == 10) {
                System.out.println("The course was offered in the Spring of " + firstFour);
            }
            else if (lastTwo == 20){
                System.out.println("The course was offered in the Summer 1 of " + firstFour);
            }
            else if (lastTwo == 30){
                System.out.println("The course was offered in the Summer 2 of " + firstFour);
            }
            else if (lastTwo == 40){
                System.out.println("The course was offered in fall of " + firstFour);
            }
            else {
                System.out.println(lastTwo + " is not a legitimate course.");
            }
                
            }
            
        
        }
    