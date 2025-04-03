//find where the arra is sorted or not


public class question7{
    public static void main(String[] args){
        int[] nums ={1,2,3,4,5};
        System.out.println(isSorted(nums));
    }

    public static int isSorted(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return -1;
            }
        }
        return 1;


    }
}