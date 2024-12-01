package loops_and_conditionals;

import java.util.Scanner;

public class AppearanceCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Integer number = in.nextInt();
//        Integer appearanceOf = in.nextInt();
//
//        int count = 0;
//
//        for (int i = 0; i < number.toString().length(); i++) {
//            if (appearanceOf.toString().charAt(0) == number.toString().charAt(i)) count++;
//        }
//
//        System.out.println(count);

        int number = in.nextInt();
        int appearanceOf = in.nextInt();

        int count = 0;

        while(number>0){
            if(number % 10 == appearanceOf){
                count++;
            }
            number /= 10;
        }

        System.out.println(count);
    }
}
