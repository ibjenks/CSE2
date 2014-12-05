/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    int n=0;
    if(scan.hasNextInt()){
      n =scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      System.out.println("You didn't enter an int"); // safeguard against weird inputs or no inputs
    }
    
    int k=4,p=6,q=7,r=8;
    int total = k+p+q+r+n;
    
    System.out.println("sum is "+total); 
      
    System.out.println("Again, you entered "+n); // changed "To repeat" to "Again"
    
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
     The program was meant to gather an int from the user, print out what the user entered,
     what the sum of the int they entered is amongst other variables and then print out what number they entered again.
     Along with doing that it was supposed to check for wrong inputs.
     So to check if the input was an int, I used .hasNextInt() in an if statement to check if it was an int or not
     if what was entered was an int, then it was assigned to the variable n and added to the other int variables
     and printed out the sum of all the ints and then had the program print out the number that was entered again
     
 */