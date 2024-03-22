/**
 * Student: Nirupama Poojari
 * Section: CSE 174 J
 * Professor: Kaylynn Borror
 * Lab9.java
 * Practicing writing methods.
 */
 
// Coding for importing java cod
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab9 {
    // main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        int option;
        
        do {
            menu();  // Displaying the menu
            try {
                option = in.nextInt();
            } catch (InputMismatchException err) {
                in.next();  // clearing the input
                option = 0; // picking zero as a value for the option
            }
            switch (option) {
                case 1:
                    System.out.printf("Enter a single binary code: ");
                    char letter = getLetter(in.next());
                    System.out.printf("The letter is: %s\n", letter);
                    break;
                case 2:
                    System.out.printf("Enter binary codes: ");
                    String word = getWord(in.next());
                    System.out.printf("The word is: %s\n", word);
                    break;
                case 3:
                    System.out.printf("End!\n");
                    break;
                default:
                    System.out.printf("Invalid Input!\n");
            }
        } while (option != 3);
    }
    
    /*
     * Prints a menu with options on the display.
     */
    private static void menu() {
        System.out.printf("\n**Binary Code Translator v 1.0**\n");
        System.out.printf("1. Translate a binary code into a letter\n");
        System.out.printf("2. Translate binary codes into a word\n");
        System.out.printf("3. Exit\nEnter a number [1-3]: ");
    }
    
    
    public static char getLetter(String binaryCode) {
        // Index for the binary code from the right
        int binryCodeLen = binaryCode.length() - 1;
        int indexFromRight = 0;
        double asciiCodeSum = 0;
        try {
            //Read char fron binary code string 
            for (int i = binryCodeLen; i > 0; i--) {
                binaryCode.charAt(i);
                Math.pow(2, indexFromRight);
                //if the character is 1, use the calculation                
                if (binaryCode.charAt(i) == '1') {
                    asciiCodeSum = asciiCodeSum + Math.pow(2, indexFromRight);
                }
                indexFromRight++;
            }
        } catch (Exception e) {
            System.out.printf("error" + e);
        }
        //return char for the translated binary code
        return ((char) asciiCodeSum);
    }
    // ADD getLetter and getWord methods here 
    
    public static String getWord(String binaryCode) {
        String returnValue = "";
      
        //Read fron binary code string 
        for (int i = 0; i < binaryCode.length(); i = i + 8) {
            //Read 8 char fron binary code string 
            String binaryCodeForletter = binaryCode.substring(i, i + 8);
           
            // get the letter from 8-char binary code
            char oneLetter = getLetter(binaryCodeForletter);
            //concatnate letter           
            returnValue = returnValue + Character.toString(oneLetter);
        }

        return returnValue;
    }
}
