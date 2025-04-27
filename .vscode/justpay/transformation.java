public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.next();
        int n = s.length();
        int i=0;
        int ans =0;
        while(i< n-1){
            if((s.charAt(i)=='X' && s.charAt(j)=='Y')||(s.charAt(i)=='Y' && s.charAt(j)=='X')){
                ans++;
                i +=2;
            }else{
                i++;
            }
        }
        System.out.print(ans);
    }
}