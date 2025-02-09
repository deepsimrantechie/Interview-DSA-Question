class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;// starting the search from the start
        //here we are chekcing from the last
        int high = nums.length-1;
        while(low<=high){  //here we are checking the iteration
            int mid  = low + (high - low)/2;// we are checking the mid 
            if(nums[mid] == target){
                return mid;
            }
            if(target< nums[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

return low;
        
    }
}