// Tyler Jenkins
// CSE002
// hw02
// Sept. 8th, 2014
// Arithmetic Application

// First compile the program
//      Arithmetic.java
// Run the program
//      java Arithmetic //

// define a class
    public class Arithmetic{
        
// add a main method
        public static void main(String args[ ] ){
            int nSocks=3, //number of pairs of socks
            nGlasses=6, // number of drinking glasses
            nEnvelopes=1; // number of boxes of envelopes
            double sockCost$=2.58, // cost per pair of socks
            glassCost$=2.29, // cost per glass
            envelopeCost$=3.25, // cost per box of envelopes
            taxPercent=0.06, // sales tax
            totalSockCost$, // total cost of socks
            totalGlassCost$, // total cost of glasses
            totalEnvelopeCost$, // total cost of envelopes
            totalTaxSocks$, // total tax of socks
            totalTaxGlass$, // total tax of glasses
            totalTaxEnvelopes$, // total tax of envelopes
            totalTax$, // total tax
            totalCost1$, // total cost without tax
            totalCost2$; // total cost with tax
            
            
            // print out the item being bought, number of item being purchased, and pricer per item
            System.out.println("Socks");
            System.out.println("3 pairs");
            System.out.println("Cost per pair of socks = "+sockCost$+" ");
            System.out.println("Drinking glass");
            System.out.println("6 drinkng glasses");
            System.out.println("Cost per glass = "+glassCost$+" ");
            System.out.println("Box of Envelopes");
            System.out.println("1 box of envelopes");
            System.out.println("Cost per box of envelopes = "+envelopeCost$+" ");
            
            totalSockCost$=nSocks*sockCost$; // calculates total cost of socks without tax
            totalTaxSocks$=totalSockCost$*taxPercent; // calculates total tax cost of socks
            System.out.println("Total cost of socks without tax = "+totalSockCost$+" ");
            System.out.printf("Tax of total cost of socks = "+"%.2f\n", totalTaxSocks$);
            
            totalGlassCost$=nGlasses*glassCost$; // calculates total cost of glasses without tax
            totalTaxGlass$=totalGlassCost$*taxPercent; // calculates total tax cost of glasses
            System.out.println("Total cost of glasses without tax = "+totalGlassCost$+" ");
            System.out.printf("Tax of total cost of glasses = "+"%.2f\n", totalTaxGlass$);
            
            totalEnvelopeCost$=nEnvelopes*envelopeCost$; // calculates total cost of boxes of envelopes without tax
            totalTaxEnvelopes$=totalEnvelopeCost$*taxPercent; // calculates total tax cost of box of envelopes
            System.out.println("Total cost of envelopes without tax = "+totalEnvelopeCost$+" ");
            System.out.printf("Tax of total cost of envelopes = "+"%.2f\n",  totalTaxEnvelopes$);
            
            totalTax$ = totalTaxEnvelopes$+totalTaxGlass$+totalTaxSocks$; // calculates total tax of all products
            totalCost1$ = totalSockCost$+totalGlassCost$+totalEnvelopeCost$; // calculates total of all products without tax
            totalCost2$ = totalCost1$+totalTax$; // calculates total of all products with tax
            
           // print out all totals (tax, without tax, and w/ tax)
           System.out.printf("Total cost without tax = "+"%.2f\n", totalCost1$);
            System.out.printf("Total tax = "+"%.2f\n", totalTax$);
            System.out.printf("Total cost with tax = "+"%.2f\n", totalCost2$);
            
            
        } // end maing method
    } // end class
