/*
*Name: Nirupama Poojari
*Professor: Kaylynn Borror
*AssignmentSix
*Purpose: Review concepts from Lesson 1 - 6 in project
* Initializing items from the library
*/
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import  java.lang.Character;
import java.util.List;
import java.util.ArrayList;

public class AssignmentTwo {

    public static void main(String[] Args) {
     try { 
       //  String nfile ="m1.txt"; 
         
         // Text prompt for user
         // More information talks about calling code through applying what I have learned from class */
        System.out.print("Enter an input file name: " );
       //  Scanner sc = new Scanner (System.in);
         Scanner input = new Scanner(System.in);
        //Read the string for the file name user entered
        String nfile = input.next();
      //   String nfile = sc.next();  
       
         Scanner myReader = new Scanner(new File(nfile));
        List<String> listStrings = new ArrayList<String>();
        
         while (myReader.hasNext()) {
         
             //Read data from the file
             String charFromFile = myReader.next();
             //System.out.println(charFromFile);
             // get values and separate values
             if (java.lang.Character.isDigit(charFromFile.charAt(0))){
             //   System.out.println("digit" +Integer.valueOf(charFromFile));
                int charCount=Integer.valueOf(charFromFile);
              //  System.out.println("charCount" +Integer.valueOf(charFromFile));

                int i=0;
                String word = "";
                while (i<charCount) {
                  charFromFile = myReader.next();
               //   System.out.println("charFromFile" +charFromFile);
                  word = word + charFromFile ;
                  i++;
                }
               // System.out.print( word + " ");
               
                listStrings.add(word);

               // outWriter.write(word + " ");
             }
                          
         }
        // System.out.println (" last word " + listStrings.get(listStrings.size()-1)); 
         for (String element : listStrings) {
              if (element.equals( listStrings.get(listStrings.size()-1))){
                 
                 System.out.println ("\n" + element);                 
              } else{
                System.out.print(element+ " ");

              }
         }
         
         System.out.printf("**Do you want to print in a file (y/n):");
          //Read the string  user entered
        String yesNo = input.next();
        System.out.printf("**Do you want to print in a file (y/n):");
        //Read the string  user entered
        String yesNo2 = input.next();

         //Enter output file name
        System.out.printf(" Enter an output file name: ");
        //Read the string for the output file name user entered
        String outfile = input.next();
         //Write to the output file name user entered 
        PrintWriter outWriter = new PrintWriter(new File(outfile));
       // Scanner myReader1 = new Scanner(new File(nfile));
        for (String element : listStrings) {
              outWriter.write(element+ " ");
        }
                          
         

        // System.out.print("\n");
        //Close the output file      
            //Otherwise, it will be locked to other programs' use
        outWriter.close();
        System.out.println("Printed inside the " + outfile + " successfully!");
        System.out.println("End!");
        
     }
     catch (Exception e){
         System.out.println ("error" + e);
     }
     /*
    // call out phrases
    tring logininfo = input.Next();
    //System.out.print("Enjoy!" + "\n");
    // reference video 7 coding strategies
    //System.out.print("**Do you want to print a file? (y/n)" + "\n");
    // Is new scanner possible?
    // System.out.print();
    //String optl = sc.inputNext();
    //String opt2 = sc.inputNext();
    //initialize two options
    //String optlcompile = optl;
    //String opt2compile = opt2;
    // System.out.print(optlninitialized);
    // System.out.print(oprninitialized);
    //System.out.print("**Do you want to print in a file? (y/n)"+ "\n");
    // import files through using
    //String printfile1 = sc.inputNext();
    //String printfile2 = sc.inputNext();
    // If printfile1 yes, than use compiled output to ensure that code itself will workdo {
    //} 
    // do {
    // System.out.print(printfile1 + "the file itself is printed");}
    //while {
    // break
    //}
    //System.out.print("yes");
    // do {
    //System.out.print("Enter an output file name? Ener an output file name: Printed inside the out1.txt successfully?: " + "\n");
    //}
    //System.out.print("no"); 
    // String z = sc.inputNext();
    //System.out.print("Enter an output file name? Enter and output file name: Printed inside the out1.txt successfully?: " + "\n");
    //String xy = sc.inputNext();
    // code for putting my assignment into effect
    //String printfileoutput1 = sc.inputNext();
    //String printfileoutput2 = sc.inputNext();
    //System.out.print(printfileoutput1);
    //System.out.print(printfileoutput1);
    //}
    //Need to use switch case to make sure that the code I am working on runs 
    // Result code at bottom
    // Note: Swtich casing itself  has failed me in understanding how it works
    //System.out.print(x);
    // next results
    //System.out.print(xy);
    // last results
    //System.out.print(z);
    // third part of results that were expected
    // More information might help in understanding how it might wor
    //*/
    }
} 