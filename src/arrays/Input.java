package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        int[] arr = new int[3];
//        arr[0] = 12;
//        arr[1] = 23;
//        arr[2] = 36;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Array Length:");
        int length = input.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter Array Elements:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }

        // for each loop syntax:
        // for(datatype ref_var: arr){
            // do_rest (ref_var represents elem of the array)
        // }

        for(int num: arr){
            System.out.print(num + " "); // here num represents elem of the array
        }

        System.out.println(Arrays.toString(arr));

    }
}
