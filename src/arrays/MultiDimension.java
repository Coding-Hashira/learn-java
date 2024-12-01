package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
            Matrix:
            1 2 3
            4 5 6
            7 8 9
        */

        Scanner in = new Scanner(System.in);

        int[][] matrix = new int[3][3]; // int[req][not req]

//        int[][] matrix = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//        };

//        int[][] nonUniformMatrix = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9},
//        };

        int[][] arr = new int[3][4];

        // input
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        // enhanced for loops
        for (int[] arrElem : arr){
            System.out.println(Arrays.toString(arrElem));
        }
    }
}
