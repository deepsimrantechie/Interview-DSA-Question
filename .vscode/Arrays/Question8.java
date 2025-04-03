
//program to find the largest index 

public class Question8{
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        System.out.println(largestIndex(nums));
    }

    public static int largestIndex(int[] nums){
        int largest = 0;
        for(int i=0;i<nums.length;i++){
            if (nums[i] != null && nums[i] > largest) {
    largest = nums[i];
}
        }
        return largest;
    } 
}