//implementation of the bfs in the java

class Solution{
      // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfsresult = new ArrayList<>();
        Boolean[] visited = new Boolean[adj.size()];  //[false,false,false,false,false,]
        Queue<Integer> q = new LinkedList<>();
        q.offer(0); //q=0 element
        visited[0] = true; //[true,false,false,false,false];
        while(!q.isEmpty()){
            int current = q.poll();
            bfsresult.add(current);

            //traverse iin the neighbout of the current node
            for(int neighbour:adj.get(current)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
        return bfsresult;
    }
}