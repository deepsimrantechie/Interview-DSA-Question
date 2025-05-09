//find the maximum path sum of bianry tree


class TreeNode{
    int val;
    TreeNode left,right;
    int(int x){
        val =x;
    }
}
class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
        
    }
    private int maxGain(TreeNode root){
        if(root == null) return;

        int leftGain = Math.max(maxGain(root.left),0);
        int rightGain = Math.max(maxGain(root.right),0);
        int currentPath = root.val + leftGain + rightGain;

        maxSum = Math.max(maxSum, currentPath);

        return root.val+ Math.max(leftGain,rightGain);
    }
}