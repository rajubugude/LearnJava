

public class LearnDp {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
//        int[] nums = {0,1,0,3,2,3};
//        int[] nums = {7,7,7,7,7,7,7};
        LearnDp obj = new LearnDp();
        System.out.println(obj.lengthOfLIS(nums));
    }

    public  int lengthOfLIS(int[] nums) {
        int prev = Integer.MIN_VALUE;
        int idx = 0;
        int n = nums.length;
        int[][] dp = new int[n+1][n+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }
        return helper(prev, idx, nums, n, dp);
    }

    public static int helper(int prev, int idx, int[] nums, int n, int[][]dp){
        if(idx == n)return 0;
        int pick = 0;
        if(prev < nums[idx]){
             pick = 1+ helper(nums[idx], idx + 1, nums, n, dp);
        }
        int not_pick;
        not_pick = helper(prev, idx + 1, nums, n, dp);
        return Math.max(pick,not_pick);
    }
}
