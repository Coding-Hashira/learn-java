package practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();

        int num1 = 0;
        int num2 = 1;
        int ans = 0;

        for (int i = 1; i < input; i++){
            ans = num1 + num2;
            num1 = num2;
            num2 = ans;
        }


        System.out.println(ans);
    }
}
