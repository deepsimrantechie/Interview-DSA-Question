//sum of all sudigit of a string

class Solution{
    public static int stringdigit(String s){
        int totalSum =0;
        int prev =0;
        int n = s.length();
        for(int i=0;i<n;i++){
            int num = s.charAt(i)-'0';
            prev = prev*10 + (long)nums*(i+1);
            totalSum += prev;
        }
        return (int)totalSum;
    }
}