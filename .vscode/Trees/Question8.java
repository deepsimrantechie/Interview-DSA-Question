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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }


//tree node replacing or inversing the value 
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;


        //recursion helps to find the left and right of the tree 
        invertTree(root.left);
        invertTree(root.right);


        //here we are returning the value of root 
        return root;
    }
   
}