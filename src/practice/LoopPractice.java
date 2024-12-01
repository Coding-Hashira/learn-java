package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopPractice {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};



//        System.out.println(Arrays.toString(getConcatenation(arr)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int ans = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j!=i && nums[i]>nums[j]){
                    ans++;
                }
            }

            arr[i] = ans;
        }

        return arr;
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < n; i++) {
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[i+n];
        }

        return ans;
    }

    static int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }

        return arr;
    }

    static int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[nums.length + i] = nums[i];
        }

        return arr;
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = candies[0];

        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max){
                ans.add(i, true);
            } else {
                ans.add(i, false);
            }
        }

        return ans;
    }
}
