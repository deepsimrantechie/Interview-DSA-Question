class Solution{
    public static boolean equalArray(int[] a , int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        if(a.length!= b.length)return false;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    } 
}