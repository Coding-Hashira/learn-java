package practice;

import java.util.Arrays;

public class Even {
    public static void main(String[] args) {
        int[] arr = {23, 2, 342, 7890};

        System.out.println(checkEven(arr));
    }

    static int checkEven(int[] arr){
        int count = 0;
        for (int j : arr) {
            if((int)(Math.log10(j) + 1) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
