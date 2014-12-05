/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+x+"%");
  double percent = (1-(x/100));
  
  if ( x >= 0 || x < 100){
    System.out.println("The proportion remaining is "+percent);
  }
  else{
    System.out.println("You did not enter a correct percentage");
  }
  
  
  
   //print out the proportion remaining for select percentages
   /* if(1-x/100==0.93)  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    else if(1-x/100==0.59)//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    else if(1-x/100==0.86)//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    else if(1-x/100==0.67)//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    else if(1-x/100==0.4)//when the user enters 60
      System.out.println("The proportion remaining is "+0.40); */
   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    the biggest problem with the previous code was that they were going to set a specific if else for every instance
 of the number entered, which would take forever. So i set a variable for the remaining proportion and let it print that out.
 *    Also, I set an if statement to check to make sure the number entered was between 0 and 99 because otherwise the percentage remaining
 wouldn't make sense. 
 *
 * 
 * 
 * 
 */
