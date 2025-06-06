//Median of Two sorted arry

class Solution {
    public double medianOf2(int a[], int b[]) {
        int m = a.length;
        int n = b.length;
        int[] temp = new int[m+n];

        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = b[j++];
            }
        }

        while(i<a.length){
            temp[k++] = a[i++];
        }
        while(j<b.length){
            temp[k++] = b[j++];
        }

        int totalLength = m+n;

        if(totalLength %2!=){
            return (double)temp[totalLength/2];
        }

      int mid1 = totalLength/2;
      int mid2 = mid1-1;
      return (double)(temp[mid1]+temp[mid2])/2.0;
        
    }
}