// we have to find the all possible path from the root to leaf

class Solution{
        public static ArrayList<ArrayList<Integer>> Paths(Node root){
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
            ArrayList<Integer> path = new ArrayList<>();
            dfs(root,path,result);
            return result;
        }

        private static void dfs(Node node, ArrayList<ArrayList<Integer>> result, ArrayList<Integer>path){
            if(node == null ) return;

            path.add(root.data);

            //check the codiion if the node have both null child thats mean we have reached to the leaf node otherwise we will check for the the next
            if(node.left== null && node.right == null) {
                result.add( new ArrayList<>(path));

            }else{
                dfs(node.left,path,result);
                dfs(node.right,path,result);
            }

            path.remove(path.size()-1);
        }
}