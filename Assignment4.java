/*Name: Nirupama Poojari
* Professor: Kaylynn Borror
* Section: CSE 174 
* Project Assignment 4
*/
// Imports all functions from java libraries that are called in code
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Assignment4 {
    //Method for handling of option 3
    public static ArrayList<Customer> option3(ArrayList<Customer> list) {
        ArrayList<Customer> newsortedlist = new ArrayList<Customer>();
        for (Customer cust :list) {
            newsortedlist.add(cust);
        }
        sort1(newsortedlist);
        System.out.println("Sorting is done!" + "\n");
        return newsortedlist;
    }
    
    // Method for handling option 4
    public static ArrayList<Customer> option4(ArrayList<Customer> list) {
        ArrayList<Customer> newsortedlist = new ArrayList<Customer>();
        for (Customer cust :list) {
            newsortedlist.add(cust);
        }
        sort2(newsortedlist);  
        System.out.println("Sorting is done!" + "\n");
        return newsortedlist;
    }

    // Option 5 public method 
    public static void option5(Scanner input, boolean sortedlistPopulated,
        ArrayList<Customer> sortedList) {
        if (!sortedlistPopulated) {
            System.out.println("Nothing is sorted yet!" + "\n");
        } else {
            System.out.println("\n" + "**** Printing the list ****");
            int linecount = 0;
            boolean ask = false;
            for (Customer cust : sortedList) {
                linecount++;
                if (!ask) {                    
                    if (linecount == 10 || linecount == 20) {
                        ask = true;
                    }
                    System.out.println(linecount + ". " +  cust.toString());
                } else {
                    System.out.print("Enter something to continue" 
                        + "/enter s to stop: ");
                    String stopreader = input.next();
                    if (stopreader.equals("s")) {
                        System.out.print("\n");
                        break;
                    } else {  
                        ask = false; 
                        System.out.print(linecount + ". " 
                            +  cust.toString() + "\n");     
                        continue;
                    }
                }
            }
            if (!ask) {
                System.out.print("\n");
            } 
        }      
    }
    // Printlist was supposed to be declared for part 1
    
    public static void printList(Scanner input, ArrayList<Customer> list) {
        System.out.println("\n" + "**** Printing the list ****");
        int linecount = 0;
        boolean ask = false;
        // enhanced for list calls out code
        for (Customer cust : list) {
            if (!ask) {
                linecount++;
                if (linecount == 10 || linecount == 20) {
                    ask = true;
                }
                System.out.println(linecount + ". " +  cust.toString());
            } else {
                // Enter a value that will help
                // and stop the code
                System.out.print("Enter something to "
                    + "continue/enter s to stop: ");
                String stopreader = input.next();
                if (stopreader.equals("s")) {
                    break;
                } else {  
                    //linecount =0; 
                    ask = false;  
                    linecount++;
                    System.out.print(linecount + ". " 
                        +  cust.toString() + "\n"); 
                    continue;
                }
            }
        }
        //if (linecount < 10){
        System.out.print("\n");

    }

    public static ArrayList<Customer> option1(Scanner input)
        throws FileNotFoundException {
        // throw statement is used for calling out how the file will work
        System.out.print("\n" + "Enter the name of the file:"); 
        String filename = input.next();
        Scanner inputReader = new Scanner(new File(filename));
        ArrayList<Customer> list = new ArrayList<Customer>();
        // adds to the newly declared list
        while (inputReader.hasNext()) {
            String nickname = inputReader.next();
            String id = inputReader.next();
            Customer cust = new Customer(nickname, Long.parseLong(id));
            list.add(cust);
        }
        System.out.println("Loading from the file is done!\n");
        return list;
    }
    
    public static int userOptions(Scanner input) {
        int userinput = 0;
        // Scanner input is the display which 
        //strings from data that will be called from method
        System.out.println("1. Load from a file");
        System.out.println("2. Print the loaded list");
        System.out.println("3. Sort the list based on the nicknames");
        System.out.println("4. sort the list based on the ids");
        System.out.println("5. Print the sorted list");
        System.out.println("6. Exit");
        System.out.print("Enter a number[1-6]:");
        userinput = input.nextInt();
        return userinput;
    }
    
    public static void printNoData(int userinput) {
        if (userinput >= 2 && userinput < 6) {
            System.out.println("No data has been loaded yet!");
            System.out.print("\n");
        } 
    }
    
    public static void main(String[] arg) throws FileNotFoundException {    
        int userinput = 0;
        ArrayList<Customer> list = null;
        ArrayList<Customer> sortedList = new ArrayList<Customer>();
        boolean sortedlistPopulated = false;
        boolean dataLoaded = false;
        Scanner input = new Scanner(System.in);
        do {
            userinput = userOptions(input);
            if ((userinput != 1) && (!dataLoaded)) {
                printNoData(userinput);
            } else {
                if (userinput == 1) {
                    list = option1(input);
                    dataLoaded = true;
                    sortedlistPopulated = false;
                    sortedList.clear();                   
                } else if (userinput == 2) {   
                    printList(input, list);
                } else if (userinput == 3) {
                    sortedList = option3(list);
                    sortedlistPopulated = true;
                } else if (userinput == 4) {
                    sortedList = option4(list);                        
                    sortedlistPopulated = true;
                } else if (userinput == 5) {
                    option5(input, sortedlistPopulated, sortedList);
                }
            }
        } while (userinput != 6);
        System.out.println(" End!");
    }
    
    //Selection sort based on nicknames
    public static void sort1(ArrayList<Customer> list) {    
        for (int i = 0; i < list.size() - 1; i++) {
            int indMin = i;
            // finding the index 
            //of the minimum value
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getName()
                    .compareTo(list.get(indMin).getName()) < 0) {
                    indMin = j;
                }
            }
            // swapping if needed
            if (indMin != i) { 
                Customer temp = list.get(indMin);
                list.set(indMin, list.get(i));
                list.set(i, temp);                         
            }
        }
    }
    // Selection sort based on ids of customer
    
    public static void sort2(ArrayList<Customer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int indMin = i;
            // finding the index of the minimum value
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getId() < list.get(indMin).getId()) {
                    indMin = j;
                }
            }
            // swapping if needed
            // customer temp code was inspired from code
            if (indMin != i) { 
                Customer temp = list.get(indMin);
                list.set(indMin, list.get(i));
                list.set(i, temp);
            }
        }

    }
    
    // Ends the class     
}
