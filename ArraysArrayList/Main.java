public class Main {
    public static void main(String[] args) {
        // Remember this file is just for fun.
        // It's main purpose is to show us the do's and dont's

        // Q1: Store a roll number
        int a= 19;

        // Q2: Store a person's name
        String name = "Mark Mwangi";

        // Q3: Store 5 roll numbers. Imagine 1000 roll numbers. that'd be tiresome!!!
        int rno1 = 23;
        int rno2 = 24;
        int rno3 = 25;
        int rno4 = 26;
        int rno5 = 27;

        // Array Syntax
        // datatype[] reference variable = new datatype [size];
        // Examples

        String[] driverNames = new String[5];
        // Or directly
        String[] driverNames1 = {"Mark", "James", "Joe", "Jeff"};

        int[] rnos = new int[5];
        // Or directly
        int[] rnos1 = {23, 24, 25, 26, 27};

        int[] ros; // Declaration od array. ros is getting defined in the stack.
        ros = new int[5]; // Initialisation: Object is being created in the memory (heap memory).

        System.out.println(rnos[0]);
    }
}