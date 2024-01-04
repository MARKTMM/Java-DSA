import java.util.Scanner;
public class Primitives {
    public static void main(String[] args) {
//        int rollno = 35;
//        char letter = 'm';
//        float marks = 96.72;
//        long largeInteger = 5644845154845484514L;
//        double largeDecimalNumber = 45464.4444;
//        boolean check = false;

        // String is not primitive. Primitives are any datatypes that can't be broken further.
        //String name = "Mark";
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name?");
        String studentName = input.next();
//        Scanner age = new Scanner(System.in);
        System.out.println("How old are you?");
        int studentAge = input.nextInt();
        System.out.println("your name is "+ studentName + "and your age is "+ studentAge);
    }
}