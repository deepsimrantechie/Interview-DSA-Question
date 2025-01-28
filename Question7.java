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
//phele hi check kr liya ki root node null hai to symmetry hogi hi
        if(root == null){
            return true;
        }

        return isMirror(root.left,root.right);
        

    }
//creating is mirror function here to check and compare the left and right tree 
    public boolean isMirror(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){// checking if both are null
            return true;
        }

        if(t1 == null || t2 == null){//checking if only one of them is null
            return false;
        }

        return (t1.val == t2.val) && isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);
        //here we are finally checking the value of t1 an t2 checking and comparing the value of t1 and t2 
    }
}