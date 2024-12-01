package sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-23,0,23,-1,100};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = max(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        // run the steps n - 1 times;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }

            if (!swapped){
                break;
            }
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];

        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int max(int[] arr, int start, int end){
        int max = start;

        for (int i = start; i <= end; i++){
            if (arr[i] > arr[max]){
                max = i;
            }
        }

        return max;
    }
}
