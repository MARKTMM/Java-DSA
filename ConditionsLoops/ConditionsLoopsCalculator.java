import java.util.Scanner;
public class ConditionsLoopsCalculator {
    public static void main(String[] args) {
        /*
            Syntax of if statements:
            if (boolean expression T or F) {
                // body
            } else {
                // do this
            }
         */

        //Let's start a coffee shop called Mark's coffee shop. # This will be fun.
        // Step 1 : Build a Robot Barista

        System.out.println("Hello, welcome to Mark Coffee!!!!!!!!!!!");
        // Ask name
        System.out.print("What is your name?? ");
        Scanner name = new Scanner(System.in);
        String clientName = name.next();
        // Added a security feature where Ben is forbidden
        if (clientName.equals("Ben")) {
            System.out.println("Your are not welcome here Ben!!!!!");

            // Stop the program if the clientName is "Ben"
            return;
        }
        System.out.println("Hello " + clientName + ", thank you so much for coming in today.");

        // Define and display the menu to the user
        String menu = "Black coffee, Espresso, Latte, Cappucino";
        System.out.println(clientName + ", what would you like from our menu today? Here is what we are serving." + menu);
        // Take client's order
        Scanner order = new Scanner(System.in);
        String clientOrder = order.nextLine();

        int price = 0; // Initialize the price variable

        // Use if-else if statements to determine the price based on the client's order
        if (clientOrder.equals("Black coffee")) {
            price = 10;
        } else if (clientOrder.equals("Espresso")) {
            price = 50;
        } else if (clientOrder.equals("Latte")) {
            price = 150;
        } else if (clientOrder.equals("Cappuccino")) {
            price = 200;
        } else {
            System.out.println("Sorry, we don't have that on the menu.");
        }

        // Display the price to the client
        if (price > 0) {
            System.out.println("Your total price for " + clientOrder + " is: $" + price);
        }
    }
}