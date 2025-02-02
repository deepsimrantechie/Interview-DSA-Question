class Solution {
    public boolean canJump(int[] nums) {

        //intializing the farthest with the zero
        int farthest = 0;
        //we are using for loop for iteratint the array
       for (int i=0; i<nums.length;i++){
        //checking if already the i is greater than the farthest then it is not possible to jump 
        if(i>farthest){
            return false;
        }
//function to find the max from the both the farthest and choosing maximum one 
        farthest = Math.max(farthest,i+ nums[i]);
        if(farthest>= nums.length-1){
            return true;
        }
       }
       return false;
        
    }
}