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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null){ ///checking the first node of the tree if the tree is null than it would return true
            return true;
        }
        if(p == null || q == null){//checking if one of the node of tree is null then it will be false 
            return false;
        }
        if(p.val != q.val){  //also if the first values of both tree is not same then also it returns false
            return false;
        }

        return isSameTree(q.left,p.left ) && isSameTree(p.right,q.right);  //here we are checking the left and right node of the recursively
        
    }
}