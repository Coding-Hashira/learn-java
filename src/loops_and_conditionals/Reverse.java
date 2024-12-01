package loops_and_conditionals;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int ans = 0;

        while (n>0){
            int rem = n % 10;
            ans = (ans * 10) + rem;
            n /= 10;
        }

        System.out.println(ans);
    }
}
