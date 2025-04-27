import java.util.*;
public class Main{
    public static void bfs(int src,int[] dist,int[] edge,int n){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            dist[i] = Integer.MAX_VALUE;
        }

        q.add(src);
        dist[add] =0;
        while(!q.isEmpty()){
            int x= q.remove();
            int y = edge[x];
            if(dist[y]==Integer.MAX_VALUE){
                dist[y] = dist[x]+1;
                q.add(y);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] edge = new int[n];
        for(int i=0;i<n;i++){
            edge[i] = scanner.nextInt();
        }

        int c1= scanner.nextInt();
        int c2 = scanner.nextInt();
        int[] dist1 = new int[n];
        int[] dist2 = new int[n];
        bfs(c1,dist1,edge,n);
        bfs(c2,dist2,edge,n);

        int minDist = integer.MAX_VALUE;
        int ans =-1;
        for(int i=0;i<n;i++){
            if(dist1[i]!= integer.MAX_VALUE && dist2[i]!= integer.MAX_VALUE){
                if(minDist>dist[i] + dist2[i]){
                    minDist = dist2[i]+dist2[i];
                    ans =i;
                }
            }
        }
        System.out.print(ans);

    }
}