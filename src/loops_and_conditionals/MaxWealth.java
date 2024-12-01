package loops_and_conditionals;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{123,12,72},{-1132,1,3}};

        System.out.println(richGuy(accounts));
    }

    static int richGuy(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int i : account) {
                wealth += i;
            }
            if (wealth > max) {
                max = wealth;
            }
        }
        return max;
    }
}
