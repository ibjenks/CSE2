import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/0; // the runtime error occurs here because they are attempting to divide by zero.
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * 
 * The error tells you that there is an arithemetic issue on line 9, and even tells you the error is dividing by zero.
 * 
 * 
 * 
 */
