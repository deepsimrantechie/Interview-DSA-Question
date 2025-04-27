import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //server array
        int[] server = new int[n];
        for(int i=0;i<n;i++){
            server[i] = sc.nextInt();
        }

        Arrays.sort(server);
        int number = findmaxConsecutive(server,n);
        int moveNeeded = n - number;

        System.out.print(moveNeeded);

    } 

    public static int findmaxConsecutive(int[] server,int n){
        int j=0;
        int ans =0;
        for(int i=0;i<n;i++){
            while(j<n && server[j] - server[i] <= n-1){
                j++;
                
            }
            ans = Math.max(ans, j-i);
        }
        return ans;
    }
}