//Largest odd number in string

class Solution{
    public String largestoddnumber(String num){
        int n = num.length();
        for(int i=n-1;i>=0;i--){
            char c = num.charAt(i);
            if((c-'0')%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}