
class Pair{
    int node,parent;
    pair(int node,parent){
        this.node = node;
        this.parent = parent
    }
}
class Solution {
    public boolean bfs(ArrayList<ArrayList<Integer>> adj,int src,bool[] vis){
        //using bfs
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(src,-1));
        vis[src]=true;
        while(!q.isEmpty()){
            Pair p =q.poll();
            int node = p.node;
            int parent = p.parent;;
            for(int nbr:adj.get(node)){
                if(!vis[nbr]){
                    vis[nbr]=true;
                    q.add(new pair(nbr,node));
                }else if(nbr!=parent){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int V, int[][] edges) {
       boolean[] vis = new int[V];
       for(int i=0;i<V;i++){
        if(!vis[i]){
            if(bfs(i,vis,adj))return true;
        }
       }
return false;

        
    }
}