package linear_search;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {236,12,1},
                {21,124,-29}
        };

        int target = 236;

        System.out.println(Arrays.toString(search(arr, target)));

        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }

        return new int[] {-1,1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }

        return max;
    }
}
