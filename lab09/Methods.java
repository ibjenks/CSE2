// Tyler Jenkins
// CSE002
// lab09
// Oct. 24th, 2014
//Methods Application

// First compile the program
//          Methods.java
// Run the program
//          java Methods//

import java.util.Scanner; // imports java utility Scanner

// define a class
public class Methods{
    

// add a method
    public static int getInt(Scanner a){
        int x = -1;
        Scanner scan = new Scanner(System.in);
        
        
            while (!scan.hasNextInt()){
                scan.next();
                System.out.println("You did not enter an int, try again");
            }
            x = scan.nextInt();
        
        return x;
    }

    public static int larger(int a, int b){
        if (a > b){
            return a;
        }
        else {
            return b;
        }
    }


    public static boolean ascending(int a, int b, int c){
        
        boolean order = false;
        
        if (a<b && a<c && b<c){
            order = true;
        }
        else{
            order = false;
        }
         return order;
    }






// add a main method
    public static void main(String arg [] ) {


Scanner scan=new Scanner(System.in);

	int a,b,c;
	
	System.out.println("Enter three ints");
	
	a=getInt(scan);
	
	b=getInt(scan);
	
	c=getInt(scan);
	
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  }
    
}
	
