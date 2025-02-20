class Solution {
    public int maxSubArray(int[] arr) {
        int currentMax = arr[0];
        int maxSofar = arr[0];
        for(int i=1;i<arr.length;i++){
            currentMax = Math.max(currentMax + arr[i] , arr[i]);
            maxSofar = Math.max(maxSofar,currentMax);
        }
        return maxSofar;
        
    }
}