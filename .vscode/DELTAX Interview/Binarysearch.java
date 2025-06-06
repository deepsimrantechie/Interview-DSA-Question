class Solution{
    public static int binarysearch(int[] arr,int k){
        int start = 0;
        int end = arr.length-1;
        int result =-1;
        while(start<end){
            int mid = start+(end-start)/2;

            if(arr[mid]==x){
                result = mid;
                end = mid-1;
            }else if(x<arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return result;
    }
}