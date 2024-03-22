/**
 * name: Nirupama Poojari
 * Section: F-J
 * Sep 2021
 * CountTires.java
 * This program is supposed to calculate values from the following lab prompt
 **/

public class CountTires {

    public static void main(String[] args) {
        int pairs = 19873123;
        int tires = pairs * 2;
        int cars = tires / 4;
        int tiresLeft = tires - cars * 4;
        System.out.println("The number of: " + tires 
               + " tires are added to the production line!");
        System.out.println(cars + " cars are produced.");
        System.out.println(tiresLeft + " tires are left.");
    } // End main loop
    
} // End class
