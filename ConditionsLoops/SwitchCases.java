import java.util.Scanner;
public class SwitchCases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Between mango, apple, grapes and orange, which is your best fruit?");
        String userInput = input.next();
        String fruit = userInput.toUpperCase(); // Convert user input to uppercase.

        switch (fruit) {
            case "MANGO":
                System.out.println("Sweet mangoes are my favourite. I haaate the bitter ones though!!");
                break;
            case "APPLE":
                System.out.println("I loooove apples.");
                break;
            case "GRAPES":
                System.out.println("Sometimes grapes taste weird.");
                break;
            case "ORANGE":
                System.out.println("Oranges are nice.");
                break;
            default:
                System.out.println("Please input a valid fruit.");
        }
        // I know this code is dirty but below are examples of nested switch statements.
        System.out.println("Employer name?");
        String empInput = input.next();
        String empid = empInput.toUpperCase(); // Convert user input to uppercase.

        switch (empid) {
            case "BEN":
                System.out.println("Ben belongs to the cleaning department.\nNice work ben.");
                break;
            case "JOSEPH":
                System.out.println("Joseph belongs to the procurement department.");
                break;
            case "MARK":
                SwitchCases
        }
    }
}