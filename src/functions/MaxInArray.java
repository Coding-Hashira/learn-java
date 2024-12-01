package functions;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,9,8,12};

        System.out.println(max(arr, 1, 4));
    }

    static int max(int[] arr, int start, int end){
        int maxValue = arr[start];

        if (end<start){
            return -1;
        }

        if (arr.length==0){
            return -1;
        }

        for (int i = start; i < end; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }

        return maxValue;
    }
}
