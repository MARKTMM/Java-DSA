/* NB
* public - This just means that this class can be accessed from anywhere.
* class - Name group of properties and functions.
* InputOutput - Name of the file.
* PUBLIC - Since main is the main function we need to make it public for the program to run and for it to be accessible.
* static - We want to run this main function without creating an object of class InputOutput.
* void - Return type of the function.
* main - Function
* (String[] args) - command line argument.
* TO RUN USING TERMINAL
* javac "filename" then java "filename" or javac -d ./..
*
* */

import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Hello "+ name.next());
    }
}