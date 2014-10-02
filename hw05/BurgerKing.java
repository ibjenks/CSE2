// Tyler Jenkins
// CSE002
// hw05
// Sept. 29th, 2014
//Burger King Application

// First compile the program
//          BurgerKing.java
// Run the program
//          java BurgerKing//

import java.util.Scanner; // imports java utility Scanner

// define a class
public class BurgerKing{
    
// add a method
    public static void main(String args [] ) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a letter to indicate a choice of");
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.println("Fries (F or f)");
         
        String order =  myScanner.next();
        int orderLength = order.length();
        
        if (orderLength > 1) {
            System.out.println("You entered more than one letter.");
            return;
        }
        
        switch (order){
            
            case "B":
            case "b":
                myScanner = new Scanner(System.in);
                System.out.print("Enter A or a \"all the fixins\"");
                System.out.println("\n Enter C or c for cheese");
                System.out.println("N or n for none of the above");
                
                String fixins = myScanner.next();
        
                switch (fixins) {
                    case "A":
                    case "a":
                        System.out.println("You ordered a burger with all the fixins");
                        break;
                    case "C":
                    case "c":
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "N":
                    case "n":
                        System.out.println("You ordered a plain burger");
                        break;
                    default :
                    System.out.println("You entered a wrong letter");
                    break;
                    
                }
        
            break;
            
            case "S":
            case "s":
                System.out.println("Do you want Pepsi (P or p), Sprite (S or s), \n Coke (C or c),or Mountain Dew (M or m)");
                
                String drink = myScanner.next();
                
                switch (drink) {
                    
                    case "P":
                    case "p":
                        System.out.println("You ordered Pepsi");
                        break;
                    case "C":
                    case "c":
                        System.out.println("You ordered Coke");
                        break;
                    case "S":
                    case "s":
                        System.out.println("You ordered Sprite");
                        break;
                    case "M":
                    case "m":  
                        System.out.println("You ordered Mountain Dew");
                        break;
                    default:
                    System.out.println("You didn't enter a correct letter");
                    break;
                }
            break;
            
            case "F":
            case "f":
                System.out.println("Do you want a large (L or l) or small (S or s) order of fries?");
                
                String fries = myScanner.next();
                
                switch (fries){
                    
                    case "L":
                    case "l":
                        System.out.println("You ordered a large order of fries");
                        break;
                    case "S":
                    case "s":
                        System.out.println("You ordered a small order of fries");
                        break;
                    default:
                    System.out.println("You didn't enter a correct letter");
                    break;
                      
                }
                
                break;
                
                default:
                System.out.println("You didn't enter a letter");
                break;
        }
        
        
            
    }
}