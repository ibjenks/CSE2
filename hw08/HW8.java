// Tyler Jenkins
// CSE002
// hw07
// Oct. 26th, 2014
//HW8 Application

// First compile the program
//          HW8.java
// Run the program
//          java HW8//

import java.util.Scanner; // imports java utility Scanner

// define a class
public class HW8{


public static char getInput(Scanner a, String b){ // method that receives scanner input and string input and returns a char
    Scanner scan = new Scanner (System.in); // declaring and initializing variables
    String input = "";
    boolean check = false;
    char x;
    int length2 = b.length();
     
    
    
while (true){ // while loop used to repeat inner body code until correct input is entered
    
    input = scan.next();
    int length = input.length();
    if (length >1){                  // checks if whatever is entered is greater than one character
        System.out.println("Enter exactly one character: try again"); // if more than one char is entered, print out
        continue; // restart outermost while loop
        
        
    }
   
   x = input.charAt(0); //sets string to char
   
    for (int i = 0; i < length2; i++){  // for loop that checks if the char is equal to any char in the string b
        if (b.charAt(i) == x){
            check = true;
        }
    }
        if (check == true){ // if it does match one, return x to main method
           return x; 
        }
        else{ // if x doesnt match any char in string b print statement below and return to outermost while loop again
            System.out.println("You did not enter a character in the list \"Cc\": Try again");
            continue; // restart outermost while loop
        }
    
   
    
     } // end while loop
    


         
    } // end method

public static char getInput(Scanner a, String b, int y){ //method that receives scanner, string, and int input and returns a char
    Scanner scan = new Scanner (System.in); // declaring and ititializing variables
    String input = "";
    boolean check = false;
    char x;
    int length2 = b.length();
    int numberWrong = 0;
     
    
    
while (true){ // while loop used to repeat inner body code until correct input is entered
    numberWrong++; // add 1 to numberWrong variable
    
    input = scan.next();
    int length = input.length();
    if (length >1){         // checks if whatever is entered is greater than one character
        System.out.println("Enter exactly one character: try again"); // if more than one char is entered, print statement
        
        continue; // restart outermost while loop
        
        
    }
   
   x = input.charAt(0); // set string to a char
   
    for (int i = 0; i < length2; i++){ // for loop that checks if the char is equal to any char in the string b
        if (b.charAt(i) == x){
            check = true;
        }
    }
        if (check == true){ // if is equal to any, return that char (x)
           return x; 
        }
        else{ // if the char isnt equal to any of the chars in string b, then print statement below
            System.out.println("You did not enter a character in the list \"YyNn\": Try again");
            if(numberWrong == y){ // if an incorrect char has been entered 5 times then do if
                x = 32; // sets char to a literal that is ' '
                System.out.println("You failed "+y+" times"); // print statement
                return x; //return char literal
            }
            continue; // restart outermost while loop
        }
    
   
    
     } // end while loop





} // end method

public static char getInput(Scanner a, String b, String c){ // declaring a method that receives scanner, string, and string input and outputs a char
    Scanner scan = new Scanner (System.in); // declaring and initializing variables
    String input = "";
    boolean check = false;
    char x;
    int length2 = c.length();
     
    
    System.out.println(b+ " "); // printing out the statement in string b
    System.out.print("Enter one of: "); // print out statement
    
    for (int i = 0; i <= length2; i++){ // for loop that prints out each char in string c
        System.out.print("\'"+i+"\'"+", ");
    }
    
while (true){ // while loop used to repeat inner body code until correct input is entered
    
    input = scan.next();
    int length = input.length();
    if (length >1){ // checks if more than one char has been entered
        System.out.println("Enter exactly one character: try again"); // if more than one char has been entered print
        continue; // restart outermost while loop
        
        
    }
   
   x = input.charAt(0); // set string to a char variable x
   
    for (int i = 0; i < length2; i++){ // for loop that checks if char is equal to any char in string c
        if (c.charAt(i) == x){
            check = true;
        }
    }
        if (check == true){ // if char is equal to any char in string c, return char x
           return x; 
        }
        else{ // if char isn't equal to any char in string c, print statement
            System.out.println("You did not enter an acceptable character");
            continue; // restart outermost loop
        }
    
        
    
    
}// end while loop
} // end method




// declare a main method

public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in); // gather input from user
	
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); // print out statement
	input=getInput(scan,"Cc"); // call method getInput
	
	System.out.println("You entered '"+input+"'"); // print out statement
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); // print out statement
	
	input=getInput(scan,"yYnN",5); //call method, give up after 5 attempts
	
	if(input!=' '){ // if the user didnt fail 5 times
   
   	System.out.println("You entered '"+input+"'"); // print out statement
	}

	input=getInput(scan,"Choose a digit:","0123456789"); // call method, print out statement
	System.out.println("You entered '"+input+"'"); // print out statement
  }  // end main method
} // end class
