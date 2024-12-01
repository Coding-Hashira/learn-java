package binary_search;

import java.util.Arrays;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,14,18,23,27,30};
        int[] arr2 = {90, 75, 54, 43, 34, 27, 19, 9};
        int target = 27;

        System.out.println(search(arr1, target));
        System.out.println(search(arr2, target));

        System.out.println(Character.getNumericValue((27 + "").toCharArray()[0]) + Character.getNumericValue((27 + "").toCharArray()[1]));
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (arr[mid] < target){
                    start = mid + 1;
                } else if (arr[mid] > target){
                    end = mid - 1;
                }
            }
            else {
                if (arr[mid] > target){
                    start = mid + 1;
                } else if (arr[mid] < target){
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
