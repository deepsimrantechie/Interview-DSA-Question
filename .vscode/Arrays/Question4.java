class Solution {
    public int removeDuplicates(int[] nums) {
        //here we are checking if the array is already empty
        if(nums.length == 0){
            return 0;
        }

        //intializing the empty error for the new array to remove duplicate

        int j=1;
        //using for loop for continoues iteration
        for(int i=1; i<nums.length;i++){
            //checking of the element at first is equal to the previous element or not 
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
        
    }
}