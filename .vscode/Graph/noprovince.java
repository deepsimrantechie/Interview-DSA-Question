
class Solution {
   
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int cnt = 0;

        // Loop through each city (node)
        for (int node = 0; node < visited.length; node++) {
            // If city hasn't been visited, it's part of a new province
            if (!visited[node]) {
                cnt++;
                dfs(node, isConnected, visited); // Explore the entire province
            }
        }

        return cnt;
    }

    // Depth First Search helper function
    public void dfs(int node, int[][] isConnected, boolean[] visited) {
        visited[node] = true; // Mark the current city as visited

        // Visit all cities directly connected to this one
        for (int neighbour = 0; neighbour < visited.length; neighbour++) {
            // If connected and not visited, recursively visit it
            if (isConnected[node][neighbour] == 1 && !visited[neighbour]) {
                dfs(neighbour, isConnected, visited);
            }
        }
    }
}