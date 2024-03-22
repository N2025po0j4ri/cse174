/**
 * name: Nirupama Poojari
 * Section: F-J
 * Sep 2021
 * Program1.java
 * This program decodes the digits.
 */
import java.util.Scanner;  // importing Scanner class

public class Program1 {
    public static void main(String[] args) {
        // Defining a Scanner object
        Scanner in = new Scanner(System.in);
        
        // Prompting the user with a message
        System.out.print("Enter a 10 digit phone number (e.g. 5131234567): ");
        
        // Saving the given number inside a constant variable
        final long PHONE_NUM = in.nextLong();
        long first = PHONE_NUM / 10000000;
        System.out.print("(");
        System.out.print(first);
        System.out.print(") ");
        long firstm = first * 10000000;
        long firste = PHONE_NUM - firstm;
        long second = firste / 10000;
        System.out.print(second);
        System.out.print(" - ");
        long secondm = second * 10000;
        long seconde = firste - secondm;
        System.out.print(seconde + "\n");
        long third = seconde / 100;
        long thirdm = third * 100;
        long thirde = seconde - thirdm;
        third = third + 33;
        thirde = thirde + 33;
        char text1 = (char)third;
        char text2 = (char)thirde;
        System.out.print("(");
        System.out.print(first);
        System.out.print(") ");
        System.out.print(second);
        System.out.print(" - ");
        System.out.print(text2);
        System.out.print(text1 + "\n");
        first = first * 1000;
        long sixdigits = first + second; 
        sixdigits = Integer.MAX_VALUE - sixdigits;
        System.out.print(sixdigits + "\n");
        System.out.print(text2);
        System.out.print(sixdigits);
        System.out.print(text1 + "\n");
        
    }
}
