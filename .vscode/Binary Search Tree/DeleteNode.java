class Solution{
    public TreeNode deleteNode(TreeNode root, int key){
        if(root == null) return null;

        //now we will check the conditions 
        if(key<root.val){
            root.left = deleteNode(root.left,key);
        }else if(key>root.val){
            root.right = deleteNode(root.right,key);
        }else{

            //if it is a leaf node 
            if(root.left == null && root.right == null){
                return null;
            }

            //if there is only 1 child
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;

            //if there is 2 child then what we have to 
            TreeNode maxNode = findMax(root.left);
            root.val  = maxNode.val;
            root.left = deleteNode(root.left,maxNode.val);
        }
        return root;
    }


    public TreeNode findMax(TreeNode root){
        while(root.right != null){
            root = root.right;
        }
        return root;
    }
}