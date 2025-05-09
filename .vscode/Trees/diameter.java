//diameter of binary tree 



//first approch is non recursive approch which is not so good in time and space complexity
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        Map<TreeNode,Integer> map = new HashMap<>();
        Stack<TreeNode > stack = new Stack<>();
        int diameter =0;
        if(root != null)stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.peek();

            //fill up stack to perform post order treversal
            if(node.left != null && !map.containsKey(node.left)){
                stack.push(node.left);
            }else if(node.right != null && !map.containsKey(node.right)){
                stack.push(node.right);
            }else{
                stack.pop();
                int leftDepth = map.getOrDefault(node.left,0);
                int rightDepth = map.getOrDefault(node.right,0);

                //put the max depth at a node in a map
                map.put(node, 1+ Math.max(leftDepth,rightDepth));
                diameter =Math.max(diameter,leftDepth+ rightDepth);
            }
        }
        return diameter;
    }
} 


//aother recursive call is 



class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new diameter[1];
        height(root,diameter);
        return diameter;
        
    }
    private int height(TreeNode node, int[] diameter){
        if(node == null )return 0;

        int lh = height(node.left,diameter);
        int rh = height(node.right,diameter);
        diameter[0] = Math.max(diameter[0],lh+rh);
        return 1+ Math.max(lh,rh);
    }
}