//max width of the binary tree


class Pair {
    int num;
    TreeNode node;
    int(int _num, TreeNode _node){
        num = _num;
        node = _node;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return;

        int ans =0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(new Pair(root,0));
       whiel(!q.isEmpty()){
        int size = q.size();
        int min = q.peek().num;
        int first =0,last =0;
        for(int i=0;i<size;i++){
            int cur_id = q.peek().num-min;
            TreeNode node = q.peek().node;
            q.poll();
            if(i==0)first = cur_id;
            if(i = size()-1)last = cur_id;
            if(node.left!= null)q.offer(new Pair(node.left,cur_id*2+1));
            if(node.right != null)q.offer(new Pair(node.right,cur_id*2+2));

        }
        ans  = Math.max(ans , last+first+1);
       }
return ans;
    }
}
