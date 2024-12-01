package practice;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        float quot = (float) num1 / num2;

        System.out.println(sum + " " + diff + " " + product + " " + quot );
    }
}
