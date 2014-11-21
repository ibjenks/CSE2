// Tyler Jenkins
// CSE002
// hw10
// Nov. 17th, 2014
//Poker Odds Application

// First compile the program
//          PokerOdds.java
// Run the program PokerOdds//
import java.util.Random; // imports java utility Random
import java.util.Scanner; // imports java utility Scanner
// define a class
public class PokerOdds{
     public static void showHands(){
     int n = 0;
     int[] deck = new int[52];
     int [] hand = new int[5];
     String[] suit2 ={"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
       String[] rank2 ={"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
     Scanner scan = new Scanner (System.in);
     String answer = "";
    do{
         
     for (int i = 0; i<deck.length; i++){
         deck[i] = i;
     }
     
     for (int j = 0; j<hand.length; j++){
         hand[j] = -1;
     }
     
     for (int y = 0; y<hand.length; y++){
       n = deck[(int) (Math.random()*52)];   
       hand[y] = n;
       for (int z = n; z<deck.length; z++){
            deck[n] = deck[n+1];
            
       }
       deck[51-y] = -1;
       
            
       }
       for(int a=0;a<4;a++){
            System.out.print(suit2[a]);
            for(int b=0;b<5;b++){
                 if(hand[b]/13==a){
                      System.out.print(rank2[hand[b]%13]+" ");
                 }
            }
            System.out.println("");
                 
     }
     System.out.println("Go again? type \"y\" or \"Y\", anything else to quit-");
     answer = scan.next();
     }
     

     while( answer.equals("y") || answer.equals("Y"));
     
     }
     
     
     public static void simulateOdds(){
          System.out.println("Rank    "+"freq exactly one pair");
          
     int n = 0;
     int[] deck = new int[52];
     int [] hand = new int[5];
     int[] counterRank = new int[13];
     int [] counterSuit = new int[4];
      
      for (int q = 0; q<counterRank.length; q++){
           counterRank[q]=0;
      }
      for (int m = 0; m<counterSuit.length; m++){
           counterSuit[m]=0;
      }
      
      
     
     String[] suit2 ={"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
       String[] rank2 ={"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
     Scanner scan = new Scanner (System.in);
     String answer = "";
    
         
     for (int i = 0; i<deck.length; i++){
         deck[i] = i;
     }
     
     for (int j = 0; j<hand.length; j++){
         hand[j] = -1;
     }
     
     for (int y = 0; y<hand.length; y++){
       n = deck[(int) (Math.random()*52)];   
       hand[y] = n;
       for (int z = n; z<deck.length; z++){
            deck[n] = deck[n+1];
            
       }
       deck[51-y] = -1;
       
            
       }
       for(int a=0;a<4;a++){
            System.out.print(suit2[a]);
            for(int b=0;b<5;b++){
                 if(hand[b]/13==a){
                      System.out.print(rank2[hand[b]%13]);
                 }
            }
                 
     }
          
          
          
     }
     
     
     
     public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  
  
  

}
