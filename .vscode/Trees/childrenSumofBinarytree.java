//children sum of binary tree
class Solution {
    // Function to check whether all nodes of a tree have the value
    // equal to the sum of their child nodes.
    public static int isSumProperty(Node root) {
      if((root == null)||(root.left == null && root.right== null)){
        return 1;
      }

      int leftView= 0;
      int rightView =0;
      if(root.left != null){
        leftView = root.left.data;
      }

      if(root.right != null){
        rightView = root.right.data;
      }

      if(root.data = leftView + rightView && isSumProperty(root.left ==1 && isSumProperty(root.right==1))){
        return 1;

      }
      return 0;
    }
}