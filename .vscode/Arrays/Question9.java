
///METHODS FOR FINDING THE SECOND MAX FROM THE ARRAY

public class Question9{
    public static void main(String[] args){
        int[] nums ={1,2,3,4,5};
        System.out.print(secondmax(nums));
    }
    
    public static int secondmax(int[] nums){
         int firstmax = Integer.MIN_VALUE;
        int secondMaxy = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>firstmax){
                secondMaxy = firstmax;
                firstmax = nums[i];
            }else if(nums[i]>secondMaxy  && nums[i]<firstmax){
                secondMaxy  = nums[i];
                
            }
            
        }
        
        if(secondMaxy  == Integer.MIN_VALUE){
            return -1;
        }
        
        return secondMaxy ;
    }
}