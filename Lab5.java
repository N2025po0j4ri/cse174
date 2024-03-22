/*

 * Nirupama Poojari
 * 9/24/2021
 * lab5.java
 * This program is used for calculating the discount for the following values
 * Code is supposed to solve the following code...
 
*/
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
//import java.util.logging.logger;
//import java.util.logging.Level;
//Logger.getGlobal().info("")';

public class Lab5 {
    private static final Logger LOGGER = Logger.getLogger("Lab5");
    
    public static void main(String[] args) {
        // LOGGER.info("Logger Name: " + LOGGER.getName());
        //set up the Scanner for user to input a month's number
        Scanner input = new Scanner(System.in); 
        //Scanner sc = new Scanner(System.in);
            
        //int product = 0;
        System.out.print("*Discount Calculator*" + "\n");
        //variables
        // Following variables for calling out integer
        System.out.print("1. Calculating dog discount" + "\n");
        // Input for user to calculate string
        
        // Stuck on inputting numbers needed for code
        System.out.print("2. Calculating cat discount" + "\n");
        System.out.print("3. Calculating rodent discount" + "\n");
        // 
        //System.out.print(input);
        //if else conditions
        // int num = sc.
        System.out.print("Enter a number [1, 2, 3]:");
        //Enter a number input value..
        int numberInput = input.nextInt(); //input.next();
        //Switch case values
        System.out.print(" Enter total purchase: ");
        int purchaseInput = 0;
        double purchaseInputDouble = 0;
        String purchaseString = input.next();
        try {     
            purchaseInput =  Integer.parseInt(purchaseString);
            //read integer purchaseInput       
        } catch (Exception e) {
            purchaseInputDouble =  Double.parseDouble(purchaseString);
        } 
        
        double discount = 0;
        int discpercent = 0;
        double payable = 0;
        //Calculate dog discount if user enters 1
        if (numberInput == 1) {
            // calculate discount for dog purchase based on purchase
            if (purchaseInput != 0) {
                if (purchaseInput <= 100) {
                    discpercent = 10;
                    discount = 0.1 * purchaseInput;
                } else if (purchaseInput > 100) {
                    discpercent = 20;
                    discount = 0.2 * purchaseInput;
                }
                payable = purchaseInput - discount;
        
            } else {
                if (purchaseInputDouble <= 100) {
                    discpercent = 10;
                    discount = 0.1 * purchaseInputDouble;
                } else if (purchaseInputDouble > 100) {
                    discpercent = 20;
                    discount = 0.2 * purchaseInputDouble;
                }
                payable = purchaseInputDouble - discount;

      
            }
        
            System.out.print("Dog discount (" + discpercent + "%): ");
            System.out.printf("%.2f",discount);
            System.out.printf("\n");

     
        //Calculate cat discount if user enters 1
        } else if (numberInput == 2) {
            // calculate discount for cat purchase based on purchase
            if (purchaseInput != 0) { 
                if (purchaseInput <= 100) {
                    discpercent = 10;
                    discount = 0.1 * purchaseInput;
                } else if (purchaseInput > 100) {
                    discpercent = 15;
                    discount = 0.15 * purchaseInput;
                }
            
                payable = purchaseInput - discount;
            } else {
                if (purchaseInputDouble <= 100) {
                    discpercent = 10;
                    discount = 0.1 * purchaseInputDouble;
                } else if (purchaseInputDouble > 100) {
                    discpercent = 15;
                    discount = 0.15 * purchaseInputDouble;
                }
            
                payable = purchaseInputDouble - discount;
            }  
            System.out.print("Cat discount (" + discpercent + "%): ");
            System.out.printf("%.2f",discount);
            System.out.printf("\n");

        
        //Calculate rodent discount if user enters 3
        } else if (numberInput == 3) {
            // calculate discount for rodent purchase 
            if (purchaseInput != 0) { 
                if (purchaseInput <= 100) {
                    discpercent = 10;
                    discount = 0.1 * purchaseInput;
                } else if (purchaseInput > 100) {
                    discpercent = 12;
                    discount = 0.12 * purchaseInput;
                }
            
                payable = purchaseInput - discount;
         
            } else {
                if (purchaseInputDouble <= 100) {
                    discpercent = 10;
                    discount = 0.1 * purchaseInputDouble;
                } else if (purchaseInputDouble > 100) {
                    discpercent = 12;
                    discount = 0.12 * purchaseInputDouble;
                }
          
                payable = purchaseInputDouble - discount;
            
            }
            System.out.print("Rodent discount (" + discpercent + "%): ");
            System.out.printf("%.2f",discount);
            System.out.printf("\n");
        }
        System.out.print("Price Payable: ");
        System.out.printf("%.2f",payable);
        System.out.print("\n");
        System.out.print("End\n");
        // Commenting below because the test fails
        // LOGGER.log(Level.INFO,"Price Payable" + payable);
        
    } // end main
           
} //end class

