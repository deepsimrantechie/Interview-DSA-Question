import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         char[][] grid = new char[2][n];
         for(int i=0;i<2;i++){
            String  row = sc.next();
            for(int j=0;j<n;j++){
                grid[i][j] = row.charAt(i);
            }
         }

         int ans =0;
         for(int i=1;i<n-1;i++){
            if(grid[0][1]=='.' && grid[1][i-1]=='X' && grid[1][i+1]=='X'){
                ans++;
            }
            if(grid[1][i]=='.' && grid[0][i-1]=='X' && grid[0][i+1]=='x'){
                ans++;
            }
         }
         System.out.print(ans);
    }
}