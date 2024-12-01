package loops_and_conditionals;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase!");
        } else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase!");
        } else {
            System.out.println("Wtf is this!?");
        }

    }
}
