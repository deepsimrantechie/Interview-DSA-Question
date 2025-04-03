//we have an array in which we check is it palindrom or not if not then which element we should to make it palindrome

class Solution{
    static int findOnemap(int[] arr,int n){

int ans =0;
for(int i=0,j=n-1;i<=j;){
    if(arr[i]==arr[j]){
        i++;
        j--;
    }
    else if(arr[i>arr[j]]){
        j--;
        arr[j]+=arr[j+1];
        ans++;
    }else{
        i++;
        arr[i]+=arr[i-1];
        ans++;
    }
}
return ans;

    }
}