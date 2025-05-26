//no of province in graph using dfs

class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.size()];
        int count =0;
        for(int node =0;node<visited.length;node++){
            if(!visited[node]){
                count++;
                dfs(node,isConnected,visited);
            }
            
        }
        return count;
        
    }
    public int dfs(int[][] isConnected, boolean visited ){
        visited[node] = true;
        for(int neighbour=0;neighbour<visited.length;neighbour++){
            if(isConnected[node][neighbour]==1 && !visited[neighbour]){
                dfs(neighbour,isConnected,visited);
            }
        }
    }
}