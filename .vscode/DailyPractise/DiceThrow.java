class Solution{
    static int noofways(int m,int n, int x){
        //m = no face
        //n = no of dice
        //x = target value need to archive
        int[][] dp = new int[n+1][x+1];
        dp[0][0] =1;
        for(int dice=1;dice<=n;dice++){
            for(int sum=1;sum<=x;sum++ ){
                for(int face =1;fac<=m;face++){
                    if(sum-face>=0){
                        dp[dice][sum] += dp[dice-sum][face-sum];
                    }
                }
            }
        }
        return dp[n][x];
    }
}