//JUMP GAME
class Solution{
    public boolean jumpgame(int[] nums){
        int maxReach =0;
        int last = nums.lenght-1;
        for(int i=0;i<nums.length;i++){
            if(i>maxReach){
                return false;
            }
            maxReach = Math.max(maxReach, i+ nums[i]);

            if(maxReach>= last){
                return true;
            }
        }
        return false;
    }
}