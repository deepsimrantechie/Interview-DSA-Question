class Solution {
    public int majorityElement(int[] nums) {
        //first we will intialize the value of candiate and the nums
        int candidate = 0;
        int count = 0;
        for (int i =0;i<nums.length;i++){//using for loop we are iterating the value of the array to get the candiate value 
            int num = nums[i];//here we are assignning the value of num from nums 
            if(count ==0){   //chekcing condition here 
                candieate = num;
            }
            if(num == candidate){
                count +=1;
            }else{
                count -=1;
            }
        }
        return candidate;
    }
}