package binary_search;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -5, -4, 0, 1, 2, 4, 7, 12, 16, 20, 119};
        int target = 20;

        System.out.println(binarySearch(arr, target));
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
}
