// Tyler Jenkins
// CSE002
// hw05
// Sept. 29th, 2014
//BoolaBoola Application

// First compile the program
//          BoolaBoola.java
// Run the program
//          java BoolaBoola//

import java.util.Scanner; // imports java utility Scanner

// define a class
public class BoolaBoola{
    
// add a method
    public static void main(String args [] ) {
        
        Scanner myScanner = new Scanner(System.in);

       
        
        int word1 = (int) (Math.random()*32);
        int word2 = (int) (Math.random()*32);
        int word3 = (int) (Math.random()*32);
       
        boolean first;
        boolean second;
        boolean third;
        boolean statement = false;
        
        String one, two, three;
        
        if (word1 > 16) {
            first = true;
        }
        else {
            first = false;
        }
        
         if (word2 > 16) {
            second = true;
        }
        else {
            second = false;
        }
        
         if (word3 > 16) {
            third = true;
        }
        else {
            third = false;
        }
        
        
        
        if (word1 > 16){
            one = "&&";
        }
        else{
            one = "||";
        }
        
        if (word2 > 16){
            two = "&&";
        }
        else {
            two = "||";
        }
       
        if (one.equals("&&") && two.equals("&&")){
            statement = first&&second&&third;
        }
        else if(one.equals("&&") && two.equals("||")){
            statement = first&&second||third;
        }
        else if(one.equals("||") && two.equals("||")){
            statement = first||second||third;
        }
        else if(one.equals("||") && two.equals("&&")){
            statement = first||second&&third;
        }
            
        
       System.out.println("Does "+first+" "+one+" "+second+" "+two+" "+third+" have the value true (T/f) or false (F/f)");
       
       String answer = myScanner.next();
       
       switch (answer){
           case "f":
           case "F":
               System.out.println(statement ? "wrong, try again." : "correct");
               break;
               
           case "t":
           case "T":
               System.out.println(statement ? "correct" : "wrong, try again");
               break;
               
           default:
           System.out.println("Wrong try again");
               break;
               
       }
        
        }   
       
    }

        
        