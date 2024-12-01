package loops_and_conditionals;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int ans = 0;

        for (int i = 1; i < n; i++) {
         ans = a + b;
         a = b;
         b = ans;
        }

        System.out.println(ans);
    }
}
