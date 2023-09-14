import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        // Let's build a simple java Calculator called Mark's calculator.
        // FYI i'll continue revamping this calculator code as in new directories as i proceed learning new concepts.
        Scanner in = new Scanner(System.in);

        //Take input from user till user does not press X or x
        int ans = 0;
        while (true) {
            // Take an operator as input
            System.out.println("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // Input two numbers
                System.out.println("Enter first number: ");
                int num1 = in.nextInt();
                System.out.println("Enter second number: ");
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                else if (op == 'x' || op == 'X') {
                    System.out.println("Sorry that is not an operator here.");
                    break;
                }else {
                    System.out.println(ans);
                }
            }
        }
    }
}