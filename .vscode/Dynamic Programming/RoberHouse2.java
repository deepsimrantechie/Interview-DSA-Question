class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);\
        int one = robrange(nums,0,n-2);
        int two = robrange(nums,1,n-1);
        return Math.max(one,two);
        
    }
    public int robrange(int[] nums, int start,int end){
        int n = end-start +1;
        if(n==0) return 0;
        if(n==1) return nums[start];
        if(n==2) return Math.max(nums[start],nums[start+1]);
        int[] dp = new int[n];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start],nums[start+1]);
        for(int i=2;i<dp.length;i++){
            dp[i] = Math.max(dp[i-2]+nums[start+i],dp[i-1]);
        }
        return dp[n-1];
    }
}