//insert into binary search tree

class Solution{
    public TreeNode insertBST(TreeNode root, int val){
        TreeNode newNode = new TreeNode(val);
        if(root== null) return newNode;
        TreeNode current = root;

        while(true){
            if(val<current.val){
                if(current.left == null){
                    current.left = newNode;
                    break;
                }
                current = current.left;

            }else{
                if(current.right == null){
                    current.right = newNode;
                    break;
                }
                current = current.right;
            }
        }
        return root;
    }
}