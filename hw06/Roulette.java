// Tyler Jenkins
// CSE002
// hw06
// Oct. 12th, 2014
//Roulette Application

// First compile the program
//          Roulette.java
// Run the program
//          java Roulette//

import java.util.Scanner; // imports java utility Scanner

// define a class
public class Roulette{ 
    
// add a method
    public static void main(String arg [] ) {
 
 

 
 Scanner input = new Scanner(System.in); // intialize scanner variable
 System.out.println("what number are you betting on?"); // print what number are you betting on?
 int guess = input.nextInt(); // initialize variable guess as the next int input into input
 
 int x = 0;         // intializing all the variables
 int earning = 0;
 int wins = 0;
 int loss = 0;
 int profit = 0;
 int profitLoss = 0;
 int completeLoss = 0;
 int y = 0;
 int totalWins = 0;
 int totalEarnings = 0;
 int completeLossTotal = 0;
 int timesProfit = 0;
 
 
 
 while (y < 1000){ // loop whatever is inside until y is no longer less than 1000
 while (x < 100){ // loop whatever is inside until x is no longer less than 100
      int number = (int)(Math.random() * 38); // initialize number as a random int between 0-38
      if (guess == number){ // if guess is equal to number add 36 to earning and add 1 to win
         earning += 36;
         wins += 1;
     }
     else { // else add 1 to loss
         loss += 1;
     }
     if (wins == 0){ // if wins is equal to 0 then add 1 to completeLoss
         completeLoss +=1;
     }
     if (wins >= 3){ // if wins is eaual to 3 then add 1 to timesProfit 
        timesProfit +=1;
    }
     completeLossTotal += completeLoss; // assign completeTotal to completeLossTotal plus completeLoss
     totalWins += wins; // assign totalWins to totalWins plus wins
     
     x++; // post increment of plus 1 to x
    }
    
    
     y++; // post increment of plus 1 to y
}

 totalEarnings = totalWins*36; // calculates and assigns total amount of earnings to totalEarnings
 

 System.out.println("Your total earnings were: $"+totalEarnings); // print statement and totalEarnings
 System.out.println("Number of games you made a profit on per 100 spins: "+timesProfit); // print statement and timesProfit
 System.out.println("Number of games you had a complete loss: "+ completeLossTotal); // print statement and completeLossTotal

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    } // end main method
} // end class