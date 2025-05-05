class Solution{
    public int maxPlatform(int arr[], int dep[]){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n = arr.length;
        int i=1;
        int j=0;
        int platform=1;
        int maxCount =1;
        while(i<n && j<n){
if(arr[i]<=dep[j]){
    platform++;
    i++;
}else{
    platform--;
    j++;
}
maxCount = Math.max(maxCount, platform);
        }
        return maxCount;
    }
}