//missing element in the AP this question is hard beause of its test case


class Solution {
    public int findMissing(int[] arr) {
        int n = arr.length;
        int d1= arr[1]-arr[0];
        int d2 =arr[n-1]-arr[n-2];
        int d3=(arr[n-1]-arr[0])/n;
        int d =0;
        if(d1==d2 || d1==d3) d=d1;
        else d= d2;
        if(d==0) return arr[0];
        int low =0,high = n-1;
        while(low<=high){
            int mid =(low+high)/2;
            if((arr[mid]-arr[0])/d == mid)low = mid+1;
            else
            high = mid-1;
        }
        return arr[high]+d;
        
    }
}
