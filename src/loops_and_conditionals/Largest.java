package loops_and_conditionals;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int largest = a;
        if (b > largest){
            largest = b;
        } else if (c > largest) {
            largest = c;
        }

        System.out.println(largest);
    }
}
