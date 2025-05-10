//searching in the binary search tree

class Solution{
    public TreeNode searchBST(TreeNode root, int val){
        if(root == null || root.val == va) return root;

        if(val < root.val){
            return searchBST(root.left);
        }
        return searchBST(root.right);


    }
}