//3 digit even Number
 class Solution{
    public static int threedidigit(int[] digits){
        int[] freq = new int[10];
        for(int d:digits)freq[d]++;

        ArrayList<Integer> result  = new ArrayList<>();
        for(int num =100;num<998;num=+2){
            int a = num/100;
            int b =(num/10)%10;
            int c = num%10;
            freq[a]--;
            freq[b]--;
            freq[c]--;
            if(freq[a]>=0 && freq[b]>=0 && freq[c]>=0){
                result.add(num);
            }
            freq[a]++;
            freq[b]++;
            freq[c]++;

        }

        int[] res = new int[result.size()];
        for(int i=0;i<result.size();i++){
            res[i] = result.get(i);
        }
        return res;
    } 
 }