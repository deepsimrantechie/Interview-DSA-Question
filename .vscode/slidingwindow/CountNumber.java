






//1248. Count Number of Nice Subarrays





class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k-1);
         
    }

    private int atMost(int[] nums, int k){
        int n = nums.length;
        int[] binary = new int[n];
        for(int i=0;i<nums.length;i++){
            binary[i] = nums[i]%2;
        }

        int tail =0;
        int result =0;
        int sum =0;
        for(int head =0;head<binary.length;head++){
            sum += binary[head];
            while(sum >k){
                sum -= binary[tail++];
            }
            result += head-tail +1;
        }
        return result;
    }
}