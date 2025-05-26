class Solution {
    int minCost(int[] height) {
        int n = height.length;
        int[] dp = new int[n+1];
        dp[0]  = 0;
        for(int i=1;i<height.length;i++){
            int fs = dp[i-1] +Math.abs(height[i]-height[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i>1) 
            ss= dp[i-2] + Math.abs(height[i]-height[i-2]);
            dp[i] = Math.min(fs,ss);
        }
        return dp[n-1];
    }
}