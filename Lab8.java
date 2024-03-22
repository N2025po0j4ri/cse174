/*

*Name: Nirupama Poojari
*Professor: Kaylynn Borror
*Objective: Creating code that works
*/

import java.util.Scanner;

public class Lab8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "";
        boolean isexception = false;
        do {
            answer = "";
            if (isexception) {
                isexception = false;
                while (!answer.equalsIgnoreCase("y")) {
                    System.out.print("Do you want to repeat (y/n)?");
                    answer = input.next();
                }     
            }
            System.out.print("Enter an int number: ");
            try {
                int entered = input.nextInt();     
                for (int row = 1; row <= entered; row++) {
                    for (int column = 1; column <= entered; column++) {  
                       //System.out.println("Row number" + row); 
                      // System.out.println("Column number" + column);   
                        if (row % column == 0) {
                            System.out.print("O");
                        } else {
                            System.out.print("X");
                        }                   
                    }
                    System.out.print("\n");
                }
            }
            catch (Exception e) {
                isexception = true;
                System.out.print(" in exception ");
            }
            boolean a = answer.equalsIgnoreCase("y");
            boolean b = answer.equalsIgnoreCase("N");
            while (!a && !b) {
                System.out.print("Do you want to repeat (y/n)?");
                answer = input.next();
                a = answer.equalsIgnoreCase("y");
                b = answer.equalsIgnoreCase("N");
            } 
        }
        while (answer.equalsIgnoreCase("y")); 
        System.out.print("End" + "\n");
    } 
}
