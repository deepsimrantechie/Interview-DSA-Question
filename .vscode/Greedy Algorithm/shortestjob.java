
//shortest job first question


class Solution{
    public int sjf(int bt[]){
        Arrays.sort(bt);
        int n = bt.length;
        int time =0;
        int waitingTime =0;
        for(int i=0;i<n;i++){
            waitingTime += time;
            time += bt[i];
        }

        int avg = waitingTime/n;
        return avg;
    }
}