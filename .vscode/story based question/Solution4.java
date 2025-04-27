import java.util.*;

public class LargestCycleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = scanner.nextInt();
        int[] edge = new int[n];
        int[] indegree = new int[n];
        
        for (int i = 0; i < n; i++) {
            edge[i] = scanner.nextInt();
            if (edge[i] != -1) {
                indegree[edge[i]]++;
            }
        }
        
        // Topological Sort (Kahn's Algorithm)
        Queue<Integer> queue = new LinkedList<>();
        boolean[] vis = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }
        
        while (!queue.isEmpty()) {
            int x = queue.poll();
            vis[x] = true;
            int next = edge[x];
            if (next == -1) continue;
            indegree[next]--;
            if (indegree[next] == 0) {
                queue.add(next);
            }
        }
        
        // Find cycles and compute their sums
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                int cur = i;
                int sum = 0;
                while (!vis[cur]) {
                    vis[cur] = true;
                    sum += cur;
                    int next = edge[cur];
                    if (next == -1) break;
                    cur = next;
                }
                if (cur != -1) {
                    ans = Math.max(ans, sum);
                }
            }
        }
        
        System.out.println(ans);
    }
}