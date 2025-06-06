class Solution{
    public static int equilbiriumsum(int[] arr){
        int totalSum =0;
        for(int num:arr){
            totalSum += num;
        }

        int leftSum =0;
        for(int i=0;i<arr.length;i++){
            if(leftSum == totalSum-leftSum-arr[i]){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}