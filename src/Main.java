import java.util.Scanner;

/**

 - class - A keyword used to declare a class.

 - public - An access modifier. It specifies that the method or class is accessible by any other class.

 - Main - The name of the class.

 - static - A keyword indicating that the method belongs to the class rather than instances of the class. It allows the main method to be called without creating an instance of the class. The Java runtime uses this method as the entry point for the program.

 - void - A return type indicating that the method does not return any value. It tells the compiler that the main method will not return any data.

 - main - reserved keyword for the main function. Name it something else and it'll stop working. It is the entry point for the application. When the program runs, the Java Virtual Machine (JVM) calls the main method.

 - String[] args - A parameter to the main method. It is an array of String objects which stores command-line arguments passed to the program. The args array can be used to pass information into the program.

 - System.out.println() - A method call to println on the out object of the System class (Developed by people at Java, so available to us by default)

 */

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        // System.out.print("Hello India!");

        Scanner input = new Scanner(System.in);
        System.out.println(input.next());
    }
}