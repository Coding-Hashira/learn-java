package linear_search;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {1,-290,3,-45,9,8,12};

        System.out.println(min(arr, 0, arr.length));
    }

    static int min(int[] arr, int start, int end){
        int ans = arr[start];

        if (end<start){
            return -1;
        }

        if (arr.length==0){
            return -1;
        }

        for (int i = start + 1; i < end; i++){
            if (arr[i] < ans){
                ans = arr[i];
            }
        }

        return ans;
    }
}
