//construct bianry search tree using preorder

class Solution {
    int index =0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return isBuildBst(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public TreeNode isBuildBst(int[]preorder , int lower,int upper){
        if(index == preorder.length) return null;

        int val  = preorder[index];
        if(val< lower || val>upper) return null;
        index++;
        TreeNode root = new TreeNode(val);
        root.left = isBuildBst(preorder, left,val);
        root.right = isBuildBst(preorder,val,right);
        return root;
    } 
}