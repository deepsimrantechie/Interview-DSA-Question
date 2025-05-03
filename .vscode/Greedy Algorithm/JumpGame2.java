//jump game two in this uestion we have to find the how many step it tooks to reach the end or the minimum steps greeeeeeeeeeeeeeeeeeeeeeeeedy


class Solution{
    public int jumpGame(int[] nums){
        int count =0;
        int currEnd =0;
        int maxReach =0;
        for(int i=0;i<nums.length-1;i++){
            maxReach = Math.max(maxReach, i+nums[i]);
            if(i== currEnd){
                count ++;
                currEnd = maxReach ;
            }
        }
        return count;
    }
}