// Tyler Jenkins
// CSE002
// lab08
// Nov. 22nd, 2014
// More Loops Application

// First compile the program
//          MoreLoops.java
// Run the program
//          java MoreLoops//

import java.util.Scanner; // imports java utility Scanner

// define a class
public class MoreLoops{
    
// add a method
    public static void main(String args [] ) {
        
        /*Scanner scan=new Scanner(System.in);
    int n=0;

    System.out.print("Enter an int- ");
    while(!scan.hasNextInt()){
    	scan.next(); //get rid of the junk entered by user
    	System.out.print("You did not enter an int; try again- ");
    }
        */
        
        Scanner scan = new Scanner (System.in);
        int n = 0;
        
        System.out.println("Enter an int- ");
        
        do {
           if(scan.hasNextInt()){
           break;
        }
            scan.next();
            System.out.println("you did not enter an int: try again");
        }
        
        while(!scan.hasNextInt());
        
        /*  for(int j=0;j<n && j<40;j++){
    	for(int k=0;k<j+1;k++){
   	 System.out.print('*');
    	}
    	System.out.println();
    }
        */
        n = scan.nextInt();
        int j = 0;
        int k = 0;
        
        while (j<n && j<40){
            
                k=0;
                while (k<j+1){
                    System.out.print("*");
                    k++;
                }
                System.out.println();
                j++;
                
        }
        
        
        
        
        /* int k=4;

    do{
    	System.out.println("k="+k);
    	k++;
    }
     	while(k<4);
     	*/
     	
     	k = 4;
     	
     	while (k <= 4){
     	    System.out.println("k = " + k);
     	    k++;
     	}
     	
     	
     	
     	/* int count=0;
    	while(true){
    	switch(n){
    	default: System.out.println(n + " is > 5 or <1");
   	 break;
    	case 1:
    	case 2: System.out.print("Case 2 ");
   	 continue;
    	case 3: break;
    	case 4: System.out.println("Case 4");
    	case 5: System.out.println("Case 5");
   	 break;
    	}
    	count++;
    	if(count>10)
   	 break;
    }
        */
        
        for(int count=0; count < 10; count++){
            if (n > 5 || n < 1){
                System.out.println(n+" is > 5 and or < 1 ");
            }
            else if (n==2 || n==1){
                System.out.println("Case 2 ");
                continue;
            }
            else if (n==4){
                System.out.println("Case 4 ");
                System.out.println("Case 5 ");
                break;
            }
            else if (n==5){
                System.out.println("Case 5 ");
                break;
            }
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
}