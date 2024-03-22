/*

* Name: Nirupama Poojari
* Prof. Kaylynn Borror
* 10/1/2021
* Lab Purpose: Make a grade calculator for TA
* Objective: Use all concepts taught in CSE
*/
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
//import java.io.FileNotFoundException;
//referred to this for import java.io.IOException;

public class LabSix { 
    public static void main(String[] args) {
        System.out.printf("Enter a file name:");
        //Scanner outfitted to read user input
        Scanner input = new Scanner(System.in);
        //Read the string for the file name user entered
        String nfile = input.next();
        //Enter output file name
        System.out.printf(" Enter an output file name: ");
        //Read the string for the output file name user entered
        String outfile = input.next();  
        double total = 0;
        int studentCount = 0;
        double av = 0;
        try {
            //Write to the output file name user entered 
            PrintWriter outWriter = new PrintWriter(new File(outfile));
            //Step 3 : reading the file
            //Scanner outfitted to read from file name entered
            Scanner myReader = new Scanner(new File(nfile));
            //Read data from the file
            while (myReader.hasNext()) {
                studentCount++;
                String name  = myReader.next(); 
                int score = myReader.nextInt();
                //System.out.print( calculteGrade(score) + "\n");
                outWriter.write(calculteGrade(score) + "\n");
                total = total + score; 
            } 
            System.out.print("Number of students: " + studentCount + "\n");
            outWriter.write("Number of students: " + studentCount + "\n");
            av = total / studentCount;
            //Rounded scaled for all the following resources
            // Need to put math round num
            //BigDecimal was referred to from oracle docs
            BigDecimal a = new BigDecimal(av).setScale(2, RoundingMode.HALF_UP);
            System.out.print("Class Average: " + a);
            //Close the output file      
            //Otherwise, it will be locked to other programs' use
            outWriter.close();
            //end of statement
        
        //catch  for exception handling
        } catch (Exception e) { 
            System.out.print(e);
        }
                
    }
    
    public static String calculteGrade(int score) {
    
        String grade = " ";
        if (score >= 90) { 
            grade = "A";
        } else if (score >= 80) { 
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) { 
            grade = "D";
        } else if (score <= 60) {
            grade = "F";
        }
        
        return grade;
    }       
}
//References
//1. https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html
// Big decimal here: 
//*    Title: Big Decimal
//*    Author: Oracle user
//*    Date Accessed: 10/2/2021
//*    Availability: https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html
//*