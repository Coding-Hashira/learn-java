package practice;

public class MountainArray {
    public static void main(String[] args) {
        int[] mountain = {0,4,2,1,0};

        System.out.println(peakIndexInMountainArray(mountain));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }

        return start; // start == end;

//        MY SOLUTION:
//
//        while (start <= end) {
//            int mid = start + (end - start)/2;
//
//            if (mid == 0){
//                mid++;
//            } else if (mid == arr.length -1) {
//                mid--;
//            }
//
//            if (arr[mid -1] < arr[mid] && arr[mid + 1] < arr[mid]){
//                return mid;
//            } else if (arr[mid -1] < arr[mid] && arr[mid + 1] > arr[mid]) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//
//        return -1;
    }
}
