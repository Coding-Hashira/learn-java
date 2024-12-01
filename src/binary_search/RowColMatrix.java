package binary_search;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;

        System.out.println(search2(matrix, target));
    }

    static boolean search2 (int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;

        int ub = 0, lb = m - 1, mid;
        while (ub <= lb){
            mid = ub + (lb-ub)/2;

            if (matrix[mid][n - 1] < target){
                ub = mid + 1;
            } else if (matrix[mid][n - 1] > target) {
                lb = mid;
            } else {
                return true;
            }
        }

        // here, ub == row we want to search in
        int ind = binarySearch(matrix[ub], target);
        return ind != -1;
    }

    static int binarySearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target){
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    static int[] search (int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;

        while (row<matrix.length && col>=0 ){
            if (matrix[row][col]==target){
                return new int[]{row,col};
            } else if (matrix[row][col]>target) {
                col--;
            } else {
                row++;
            }
        }



        return new int[]{-1, -1};
    }
}
