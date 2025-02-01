class Solution {
    public int removeElement(int[] nums, int val) {

//here we are intializing the array 
        int k = 0;

//using for loop we are checking the or iterating the array
        for( int i=0; i<nums.length;i++){
            if(nums[i] != val){//checking the value is eqaul or not 
                nums[k] = nums[i];//assigning thw value to the new array
                k++;//increment the new array k or increment of pointer 
            }
        }
        return k;
        //here we are returning the array k
    }
}