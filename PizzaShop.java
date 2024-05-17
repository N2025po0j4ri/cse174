/*

*Name: Nirupama Poojari
*Professor: Kaylynn Borror
*Objective: Do the Lab. Follow all directions

*/

// Update 11/4/2021 Code on how to call pizza and import file from code 

// imports java library for initiating the program
//import java.lang.Point;
// import java.util.Scanner;
// import java.lang.OutWriter;
// Below is the start of the labTwelve class
public class PizzaShop {
    // Inside the public class are the other voids that are declared
    public static void main(String[] arg) {
        // Code Below   
          
        //  System.out.print("Here is the code 
        // for calling out the lab 12 information.");
        // creating small stuffed pizza object 
        Pizza pizza = new Pizza("small", "stuffed"); 
        // Add toppings 
        pizza.addTopping("pepperoni");
        pizza.addTopping("onions");
        
        // calculate cost
        
        //System.out.println("small pizza cost" + pizzaCost(pizza));
        // Set pizza to Delievery 
        pizza.setDelivery(true);
        //System.out.println("small-stuffed pizza " + pizza.toString());
        
        //Create random pizza based on a lucky number (any int
        //value)
        Pizza randompizza = new Pizza(5);
        //System.out.println("random pizza" + randompizza.toString());
        
        // pizza cost
        
        Pizza newpizza = new Pizza(234);
        //System.out.println("new pizza 234 " + newpizza.toString());
        
        //new Pizza(234) should have a cost of $7.75.
        //System.out.println("234 pizza cost" + pizzaCost(newpizza));

        
        // new Pizza(8675) should have a cost of $10.00.
        Pizza newpizza1 = new Pizza(8675);
        //System.out.println("new pizza 8675 " + newpizza1.toString());
        //System.out.println("8675 pizza cost" + pizzaCost(newpizza1));

        //assert (pizzaCost(newpizza) == 10.00);

    }
    
   
    public static double pizzaCost(Pizza pizza) {
        double returnVal = 0;
        double cost = 0;
        //System.out.println("pizza size" + pizza.getSize());
        //$4 for small, $5.50 for medium, $7 for large
        if (pizza.getSize().equalsIgnoreCase("small")) {
            cost = 4;
        } else if (pizza.getSize().equalsIgnoreCase("medium")) {
            cost = 5.5;
        } else if (pizza.getSize().equalsIgnoreCase("large")) {     
            cost = 7;             
        } 
        //Stuffed crust: $1 extra for small, $2 for medium, $3 for large
        if (pizza.getCrust().equalsIgnoreCase("stuffed")) {
            if (pizza.getSize().equalsIgnoreCase("small")) {
                cost = cost + 1;
            } else if (pizza.getSize().equalsIgnoreCase("medium")) {
                cost = cost + 2;
            } else if (pizza.getSize().equalsIgnoreCase("large")) {     
                cost = cost + 3;             
            } 
        }
        //System.out.println("cost based on size and crust" + cost);
        double toppingCost = pizza.toppingCount() * 0.75;
        String toppings = pizza.getToppings();
        // additional $0.50 charge if
        // at least one of the toppings is anchovies.
        if (toppings.indexOf("anchovies") > 0) {
            toppingCost = toppingCost + 0.5;
        }

        //System.out.print("Toppings" + toppings + " " + "cost" + toppingCost);
        cost = cost + toppingCost;
         
        // Delivery: $2 (free for pizzas costing $10 or more)
        if ((pizza.getDelivery()) && (cost < 10)) {
            cost = cost + 2;
        }
        //System.out.print(" final cost" + cost + "\n");
        // double roundOff = Math.round(cost * 100.0) / 100.0; 
        // System.out.print(" final cost" + roundOff + "\n");
   
        return cost;
    }
    //public static void main(String[] arg) {
    
    //}
    //public static void 
}
