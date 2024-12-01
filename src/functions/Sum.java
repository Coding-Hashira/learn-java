package functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        int ans = sum2();
        System.out.println("The result of the second sum: " + ans);
        System.out.println("Third Sum: " + sum3(45, 78));
    }

    /*
        static return_type name(arguments){
            //  body
            return some shit;
        }
    */

    static int sum3(int num1, int num2){
        return num1 + num2;
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        return num1 + num2;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
