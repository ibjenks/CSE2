// Tyler Jenkins
// CSE002
// hw10
// Nov. 17th, 2014
//Find Duplicates Application

// First compile the program
//          FindDuplicates.java
// Run the program FindDuplicates//

import java.util.Scanner; // imports java utility Scanner
// define a class
public class FindDuplicates{
    
    
    
    public static boolean hasDups(int[] list){
        
        for( int i = 0; i<list.length; i++){
            for (int j = i+1; j<list.length; j++){
                if(list[i] == list[j]){
                    return true;
                
                }
            
            }
        }
        return false;
        
    }
    
    
    
    public static boolean exactlyOneDup(int[] x){
        
        for( int i = 0; i<x.length; i++){
            for (int j = i+1; j<x.length; j++){
                for (int z = j+1; z<x.length; z++){
                    if (x[i] == x[j] && x[i] == x[z]){
                        return false
                        }
                    else if (x[i] == x[j] || x[i] == x[z] || x[j] == x[z]){
                        return true;
                            }    
                     }
                
                }
            
            }
        }
        return false;
}
    
    
    
    public static void main(String [] arg){
    
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
}

