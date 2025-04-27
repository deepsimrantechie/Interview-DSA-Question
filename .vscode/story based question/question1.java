class Solution{
    double calculate(int[][] trips){
        double ans = 0;
        for(int trip:trips){
            int dist = trip[0];
            int time = trip[1];

            double fare = (dist*2)+(time*1)+5;
            ans+= fare;
        }
        return ans;
    }
}