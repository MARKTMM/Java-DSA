package OOP.oop1;

/* In this main class is where i learned the basics of Java Object oriented programming.
Not all code here is clean as i'm learning how to write clean code and perform best practices.
 */
public class Main {
    public static void main(String[] args) {
        // Create a datatype that stores 5 roll nos
        int[] numbers = new int[5];

        // Create a datatype that stores 5 names
        String[] names = new String[5];

        // Create a datatype that stores data of 5 students: {roll no, name,marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // CLASS: Named group of properties and functions.

        // Create a class
        class Student {
            int rno;
            String name;
            float marks;

            Student(int rno, String name, float marks) {
                this.rno = rno;
                this.name = name;
                this.marks = marks;
            }
        }
        Student Mark = new Student(15, "Mark Mwangi", 89.5F);
        Student James = new Student(15, "James Wangari", 89.5F);
        Student Jeniffer = new Student(15, "Jeniffer Karanja", 89.5F);
        System.out.println(Mark.rno);
        System.out.println(James.name);
        System.out.println(Jeniffer.marks);
    }
}