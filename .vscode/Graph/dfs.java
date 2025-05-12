
//depth first seach in graph


class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj){

        ArrayList<Integer> dfsresult = new ArrayList<>();
        Boolean[] visited = new Boolean[adj.size()];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        while(!stack.isEmpty()){
            int u = stack.pop();
            if(!visited[u]){
                visited[u] = true;
                dfsresult.add(u);
                //push the neighbout of u in the reverse order

                for(int i=adj.get(u).size()-1,i>=0;i--){
                    int neighbour = adj.get(u).get(i);
                    if(!visited[neighbour]){
                        stack.push(neighbour);
                    }
                }
            }

        }
        return dfsresult;
    }
    }