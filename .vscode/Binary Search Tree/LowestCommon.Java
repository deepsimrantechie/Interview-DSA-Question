//Lowest common ansestor in the binary search tree

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        int curr = root.val;
        if(p>curr.val && q>curr.val){
            return lowestCommonAncestor(root.right, p,q);
        }
        if(p<curr.val && q<curr.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        return root;
    }
}