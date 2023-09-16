import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Function Call 1
        sum();
        // Function Call 2
        int ans = sum2();
        System.out.println(ans);
        // Function Call 3
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int ans2 = sum3(num1, num2);
        System.out.println(ans2);
    }
    // Return type is void. According to me means just display.
    static void sum() {
        int num1, num2, sum;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println(sum);
    }
    // Return type is Int. According to me means return a value.
    static int sum2() {
        int num1, num2, sum2;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        sum2 = num1 + num2;
        return sum2;
    }
    // Return type is int. This function has parameters.
    static int sum3(int num1, int num2) {
        int ans2 = num1 + num2;
        return ans2;
    }
}