public class Swap {
    public static void main(String[] args) {
//        Here's another problem. Let's create a swapping simple program.
//        This will definitely be fun.
        int a = 10;
        int b = 20;

        // This program is commented out because it gives a 20 10 output.# Successful swap
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a + " " + b);

        swap(a, b); // This swap function is unsuccessful.
/* The values of a and b remain unchanged in the main method
after calling the swap method because the swap method operates
on local copies of the variables a and b.
*/
        System.out.println(a + " " + b);
    }
    static void swap(int a, int b) {
        /* Seems to achieve a successful swap, we could use either an array or a
        custom class to hold the values and modify them within the method.
         */
        int temp = a;
        a = b;
        b = temp;
    }
}