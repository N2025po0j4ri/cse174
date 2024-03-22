/*

*name: Nirupama Poojari
*Professor: Kaylynn Borror
*Lab 10: Name Formatter
*/
// imports the files
import java.util.Scanner;
//import java.lang.PrintWriter; Brainstormed online
//import java.io.PrintWriter;

public class LabTen {

    public static void main(String[] arg) {

        System.out.print("Welcome to the Name Formatter" + "\n");
        // Following code needs to run in a loop
        int option = 0;
        Scanner in = new Scanner(System.in);
        while (option < 5) {
            System.out.print("Select an Option!" + "\n");
            System.out.print("1. Only First Name" + "\n");
            System.out.print("2. First Name, and Last Name" + "\n");
            System.out.print("3. First Name, Middle Initial,"); 
            System.out.print(" and Last Name" + "\n");
            System.out.print("4. First Name, Middle Name, ");
            System.out.print("and Last Name" + "\n");
            System.out.print("5. Exit" + "\n");
            //System.out.print("6. Thank you for using the name formatter");
            // prompt to enter option from above 
            option = in.nextInt();
            // input string calls code
      
            //  System.out.print(option + "\n");
            //System.out.print();
            if (option == 5) {
            
                break; 
            } 
            System.out.print("Please enter the name ");
            System.out.print("parts separated by a space: ");
            if (option == 1) {
                // Prompt user to enter first name
                String firstName = in.next();
                formatName(firstName);
            } else if (option == 2) {
                String firstName = in.next();
                String lastName = in.next();
                formatName(firstName, lastName);
            } else if (option == 3) {
                String firstName = in.next();
                char middleInitial = in.next().charAt(0);
                String lastName = in.next();
                formatName(firstName, middleInitial, lastName);
                
            } else if (option == 4) {
                String firstName = in.next();
                String middleName = in.next();
                String lastName = in.next();
                formatName(firstName, middleName, lastName);
            }
        
        }
        System.out.println("Thank You for using the Name Formatter!");
    

    }

    public static void formatName(String firstName) {
        //8 characters for printing each part, separated by a space
        //pads spaces to the left
    
        String formatted = String.format("%-8s", firstName); 
        System.out.print(formatted + "\n");

    }
      
    public static void formatName(String firstname, String lastname) {    
        //8 characters for printing each part, separated by a space
        //pads spaces to the left

        String str2 = String.format("%-8s", firstname); 
        String str3 = String.format("%-8s", lastname); 
        System.out.print(str2 + " " + str3 + "\n");

    } 
    
    public static void formatName(String fname, char initial, String lname) {
        //8 characters for printing each part, separated by a space
        //pads spaces to the left

        String str2 = String.format("%-8s", fname); 
        //Puts a period
        String str1 = initial + ".";
        String str3 = String.format("%-8s", str1); 
        String str4 = String.format("%-8s", lname);
        System.out.print(str2 + " " + str3 + " " + str4 + "\n");

    } 

    public static void formatName(String fname, String mname, String lname) {
        //8 characters for printing each part, separated by a space
        //pads spaces to the left
        String str2 = String.format("%-8s", fname); 
        String str3b = String.format("%-8s", mname); 
        String str4 = String.format("%-8s", lname);
        System.out.print(str2 + " " + str3b + " " + str4 + "\n");

    } 


}
