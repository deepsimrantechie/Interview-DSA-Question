//1423. Maximum Points You Can Obtain from Cards


class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total =0;
        for(int i=0;i<k;i++){
            total += cardPoints[i];
        }
        int max =total;
        for(int i=0;i<k;i++){
            total = total- cardPoints[k-1-i]+ cardPoints[n-1-i];
            //this line is adding from back for xample cardpoint=[1,2,3,4,5,6,1]
//total = 6- cardpoint[3-1-0]+ cardpoint[6-1-0] = 6-cardpoint[2] + cardpoiny[5] = 6-3+5=8

            max = Math.max(max,total);
        }
        return max;
    }
}