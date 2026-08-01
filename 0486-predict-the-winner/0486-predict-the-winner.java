class Solution {
    public boolean predictTheWinner(int[] nums) {
        int left = 0;
        int n = nums.length;
        int dp[][] = new int[n][n];
        int right = nums.length -1;
        for(int[] rows : dp) Arrays.fill(rows,-1);
        int diff = solve(nums,left,right,dp);
        return diff >=0;
    }
    private int solve(int[] nums, int left, int right, int dp[][]){
        if(left == right) return nums[left];
        if(dp[left][right]!=-1) return dp[left][right];
        int tLeft = nums[left]- solve(nums,left+1,right,dp);
        int tRight = nums[right] - solve(nums,left,right-1,dp);
        dp[left][right] = Math.max(tLeft,tRight);
        return dp[left][right];
    }
}