/**

* name: Nirupama Poojari
* Section: F-J
* Sep 2021
* lab4.java
* This program decodes the digits.
/ 
**/
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lab4 {
    public static void main(String[] args) {      
        //Scanner outfitted to read user input
        Scanner input = new Scanner(System.in); 
        //prints out a prompt to the user, 
        //allows them to add their first and last name     
        //in the same line seperated by a space  
        System.out.print("Enter your first and last name: ");
        String fname = input.next();
        String lname = input.next();
        //Save first and last name for writing to the output file
        String initialfname = fname;
        String initiallname = lname;
        //prints out a prompt to the user, allows them 
        //to add their time spent sleeping each night
        System.out.print("Enter your time spent sleeping each ");
        System.out.print("night (in hours): ");
        int inithsleep;
        int hsleep = 0;
        double hsleepdouble = 0;
        String sleepstring = input.next();
        try {
          
            hsleep =  Integer.parseInt(sleepstring);
            //Save time spent sleeping each night for
            // calculation for the output file
       
            inithsleep = hsleep;
        } catch (Exception e) {
            hsleepdouble =  Double.parseDouble(sleepstring);
        } 

        //prints out a prompt to the user, allows them to add number of classes
        System.out.print("Enter your number of classes: ");
        //double nclass = input.nextDouble();
        //Read integer from string read from user prompt
        int nclass = input.nextInt();
        //double initnclass = nclass;
        //Save number of classes for calculation for the output file
        int initnclass = nclass;
        double ftimeh = 0;
        if (hsleep == 0) {
            ftimeh = 120 - (hsleepdouble * 5 + nclass * 8.72);
        } else {
            ftimeh = 120 - (hsleep * 5 + nclass * 8.72);
        }
        double roundOff = Math.round(ftimeh * 10.0) / 10.0;
        //Save roundOff for calculation for the output file
        double initroundOff = roundOff; 
        //Display information on the console
        System.out.printf("____________________________________");
        System.out.printf("__________" + "\n");
        System.out.printf("|Name                |Num Classes |");
        System.out.printf("Free Time |" + "\n");
        System.out.printf("|..................................");
        System.out.printf("..........|" + "\n");
        System.out.printf("|" + fname + " " + lname + "      |");
        System.out.printf(nclass + "           |" + roundOff);
        System.out.printf("      |" + "\n"); 
        System.out.printf(" -----------------------------------");
        System.out.printf("---------" + "\n");
        //prints out a prompt to the user, 
        //allows them to enter input file name     
        System.out.print("Enter an input filename:");
        //Read the string for the file name user entered
        String nfile = input.next();
        try {
            //Scanner outfitted to read from file name entered
            Scanner myReader = new Scanner(new File(nfile));
            //Read data from the file
            fname = myReader.next();
            lname = myReader.next();
            hsleep = myReader.nextInt();
            nclass = myReader.nextInt();
            ftimeh = 120 - (hsleep * 5 + nclass * 8.72);
            roundOff = Math.round(ftimeh * 10.0) / 10.0;
            //Display data read from input file on console
            System.out.printf("______________________________________");
            System.out.printf("________" + "\n");
            System.out.printf("|Name                |Num Classes |");
            System.out.printf("Free Time |" + "\n");
            System.out.printf("|....................................");
            System.out.printf("........|" + "\n");
            System.out.printf("|" + fname + " " + lname + "        |"); 
            System.out.printf(nclass + "           |" + roundOff);
            System.out.printf("      |" + "\n"); 
            System.out.printf(" -----------------------------------");
            System.out.printf("---------" + "\n");
            //Close the input file 
            myReader.close();
        //If error occurs reading file, handle error
        } catch (FileNotFoundException e) {
            System.out.println("An Error occurred");
            e.printStackTrace();
        } 
        //prints out a prompt to the user, 
        //allows them to add the output file name
        System.out.print("Enter an output filename: ");
        //Read the string for the output file name user entered
        String outputfile = input.next(); 
        try {
            //Write to the output file name user entered 
            PrintWriter outWriter = new PrintWriter(new File(outputfile));
            outWriter.write("_________________________________");
            outWriter.write("_____________" + "\n");
            outWriter.write("|Name                |Num Classes |");
            outWriter.write("Free Time+ |" + "\n");
            outWriter.write("|.................................");
            outWriter.write("...........|" + "\n");
            outWriter.write("|" + initialfname + " " + initiallname);
            outWriter.write("      |" + initnclass + "           |");
            outWriter.write(initroundOff + "      |" + "\n"); 
            outWriter.write("|----------------------------------");
            outWriter.write("----------|" + "\n");
            outWriter.write("|" + fname + "   " + lname + "      |" + nclass);
            outWriter.write("           |" + roundOff + "      |" + "\n"); 
            outWriter.write(" ---------------------------------");
            outWriter.write("----------" + "\n");
            //Close the output file      
            //Otherwise, it will be locked to other programs' use
            outWriter.close();
        //If error occurs writing the file, handle error
        } catch (IOException e) {
            System.out.println("An Error occurred while writing a file");
            e.printStackTrace();
        }

    }
} // End class
