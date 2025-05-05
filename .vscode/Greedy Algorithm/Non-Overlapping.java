//non overlapping intervals

class Solution{
    public in eraseOverlappingIntervals(int[][] intervals){
        int = intervals.length;
        if(n==0)return 0;

        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int remove =0;
        int PrevEnd =interval[0][1];
        for(int i=1;i<n;i++){
            if(interval[1][0]<PrevEnd){
                remove++;
            }else{
                PrevEnd = interval[i][1];
            }
            return remove;
        }
    }
}