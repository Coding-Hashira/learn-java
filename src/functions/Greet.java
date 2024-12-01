package functions;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        System.out.println(greet());

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.println(customGreeting((name)));
    }

    static String customGreeting(String name) {
        return "Hello, " + name + "!";
    }

    static String greet(){
        return "Hello, World!";
    }


}
