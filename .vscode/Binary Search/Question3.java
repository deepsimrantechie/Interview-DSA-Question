class Solution {
    public int findPeakElement(int[] nums) {

//intializing the value of binary tree
        int left = 0;
        int right = nums.length-1; //here is the right most side of binary array 

        //here is we are checking the condition 
        while(left<right){
            //we are finding the value of mid 
            int mid = (left+right)/2;
            //here we are checkking current value is mid is greater than its next value or not 

            if(nums[mid]>nums[mid+1]){
                right = mid;
            }else{
                left = mid+1;

            }
        }
        //return left
        
        return left;
    }
}