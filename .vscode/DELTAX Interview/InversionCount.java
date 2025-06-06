//inversion count approch with o(n^2)


class Solution{
    public static int inversion(int[] arr){
        int n = arr.length;
        int inversionCount =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    inversionCount++;
                }
            }
        }
        return inversionCount;
    }

}


//and approch with 0(n) using merge and merge sort and two pointer approch




class Solution{
    public static int merge(int[] arr,int[] temp,int start,int midStart,int end){
        int i = start;
        int j = midStart;
        int k = start;
        int invCount = 0;
         while(i<=mid && j<= end){
            if(arr[i]<=arr[j]){
                arr[k++]=arr[i++];
            }else{
                arr[k++] = arr[j++];
                invCount+= (mid-i+1);
            }
         }

         while(i<=mid){
            arr[k++] = arr[i++];
         }
         while(j<=end){
            arr[k++] = arr[j++];

         }
         for(i = start;i<= end;i++){
            arr[i] = arr[k];
         }
         return invCount;

    }

    public static int mergeSort(int[] arr,int[] temp,int start,int end){
        int mid =0;
        int invCount = 0;
        if(start<end){
            mid = (start+end)/2;

            invCount+= mergeSort(arr,temp,start,mid);
            invCount+= mergeSort(arr,temp, mid+1,end);
            invCount+= merge(arr,temp,start,mid+1,end);
        }
        return invCount;
    }
    public static int inversion(int[] arr){
        int[] temp = new int[arr.length];
        return mergeSort(arr,temp,start,end);
    }
}