//nCr factorial for large inputs
class Solution{
    public long nCr(int n,int r){
        if(n<r)return 0;
        if(n==0 || n==1) return 1;

        r = Math.min(r,n-r);
        long result =1;
        for(int i=0;i<r;i++){
            result *=(n-i);
            result /= (i+1);
        }
        return result;

    }
}