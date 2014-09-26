// Tyler Jenkins
// CSE002
// lab05
// Sept. 25th, 2014
// Random Games Application

// First compile the program
//          RandomGames.java
// Run the program
//          java RandomGames//

import java.util.Scanner; // imports java utility Scanner

// define a class
public class RandomGames{
    
// add a method
    public static void main(String args [] ) {
      
       
       
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card"); // ask user to enter string
        
        String answer = myScanner.next(); //acquires input
        int answerLength = answer.length(); // assigns variable answerLength the length of the string given in the scanner
        if (answerLength > 1 ){ 
            System.out.println("you entered more than one character"); // if length of string > 1 then print out statement
        }
        
        switch (answer) { // switch statement checking answer variable
            case "R":
            case "r":
            int r = (int)(Math.random()*(36 - 00)) + 00; // assign int r a random int between
            if (r == 37){
                System.out.println("Roulette: 00"); // if r == 37 then print 00 
            }
            else {
                System.out.println("Roulette: "+r); //print out r variable
            }
            break; // if case is true terminate code
           
            case "C":
            case "c":
            int firstRoll2 = (int)(Math.random()*(6-1))+1; // assign int firstRoll2 with int between 1-6
            int secRoll2 = (int)(Math.random()*(6-1))+1; // assign secRoll2 with int between 1-6
            int totalRoll2 = firstRoll2+secRoll2; // assign totalRoll2 the value of firstRoll2+secRoll2
            
            System.out.println("Craps: "+firstRoll2+"+"+secRoll2+"="+totalRoll2); // print out firstRoll1 + secRoll2 = totalRoll2
            break;
           
            case "P":
            case "p":
            System.out.println("This game is not implemented."); // case of p print out statement
            break;
           
            default:
            System.out.println("you didn't enter a correct letter or a string"); // case of anything else print out statement
            break;
        } 
        
        
        
    }
}