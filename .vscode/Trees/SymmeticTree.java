/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSysmmetricHelp(left,right);
        
    }
    public boolean isSysmmetricHelp(TreeNode left , TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;

        return isSysmmetricHelp(left.left ,right.right)&&isSysmmetricHelp(left.right,right.left);
    }
}