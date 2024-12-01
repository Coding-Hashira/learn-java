package practice;

public class SearchInRotated {
    public static void main(String[] args) {
        int[] arr = {1};

        int peak = findPeakOfRotatedArray(arr);


    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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

    static int findPeakOfRotatedArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            } else if (mid>start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] == arr[start] && arr[mid] ==arr[end]){
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                if (arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            } else if (arr[mid] > arr[arr.length - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return 0;
    }
}
