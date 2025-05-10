//find min max of binary search tre

class Solution{
    public static int findMax(TreeNode root ){
        if(root.right != null){
          return  findMax(root.right);
        }
        return root.data;

    }

    public static int findMin(TreeNode root){
        if(root.left!= null){
            return findMin(root.left);
        }
        return root.data;

    }
}