package binary_search;

import java.util.Arrays;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;

//        char[] charArr = {'c','f','j'};
//        char charTarget = 'a';

        System.out.println(Arrays.toString(searchRange(arr, target)));

//        System.out.println(nextGreatestLetter(charArr, charTarget));

//        System.out.println(ceiling(arr,target));
//        System.out.println(floor(arr,target));

    }
    
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums,target,true);
        ans[1] = search(nums,target,false);

        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target){
                end = mid - 1;
            } else {
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;

            if (letters[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start <= letters.length - 1 ? letters[start] : letters[0];
    }

//    static int ceiling (int[] arr, int target) {
//        if (target > arr[arr.length-1]){
//            return -1;
//        }
//
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start)/2;
//
//            if (arr[mid] < target){
//                start = mid + 1;
//            } else if (arr[mid] > target){
//                end = mid - 1;
//            } else {
//               return arr[mid];
//            }
//        }
//
//        return arr[start];
//    }
//
//    static int floor (int[] arr, int target) {
//        if (target < arr[0])  {
//            return -1;
//        }
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start)/2;
//
//            if (arr[mid] < target){
//                start = mid + 1;
//            } else if (arr[mid] > target){
//                end = mid - 1;
//            } else {
//                return arr[mid];
//            }
//        }
//
//        return arr[end];
//    }
}
