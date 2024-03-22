
/**
 
    * Sep, 2021
    * Author: Nirupama Poojari
    * Computes the area of a trapazoid using two sets of values.
    
**/

public class AreaChecker {
    public static void main(String[] args) {
      
        double longBase = 10;
        double shortBase = 5;
        double altitude = longBase * shortBase;
        double area = 0.0;
      
        // \n is called scape code and it moves the curser
        // to the next line. So whatever that is printed after
        // that, will be printed on the new/next line.
        System.out.println("Long Base = " + longBase 
                    + "\nShort Base = " + shortBase);
        System.out.println("Altitude = " + altitude + "\n");
        System.out.println("Adjusting Altitude to 9:");
        
        System.out.println("Long Base = " + longBase);
        System.out.println("Short Base = " + shortBase);
        altitude = 9;
        System.out.println("Altitude = " + altitude + "\n");
        area = (longBase + shortBase) / 2 * altitude;
        System.out.print("Area = ");
        System.out.println(area);
        
    }
    
}
