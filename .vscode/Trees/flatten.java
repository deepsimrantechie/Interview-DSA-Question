class Solution{
    public void flatten(TreeNode root){
        if(root == null) return ;
        flatten(root.left);
        flatten(root.right);

        TreeNode leftSubTree = root.left;
        TreeNode rightSubTree = root.right;

        root.left = null;
        root.right = leftSubTree;
        TreeNode temp = root;
        while(!temp.right!= null){
            temp = temp.next;
        }
        temp.right = rightSubTree;
    }
}