package linear_search;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,24,9,193,69};
        int target = 69;

        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
