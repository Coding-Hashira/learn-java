package basics_and_types;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        float sum = num1 + num2;
//        Give integer values, and it will still give you an answer.
//        Replace types with int and then give a float value. Will give error.

        System.out.println(sum);

    }
}
