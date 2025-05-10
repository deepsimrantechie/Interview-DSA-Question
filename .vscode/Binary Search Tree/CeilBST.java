class Solution{
    int findCeil(TreeNode root, key){
        if (root == null) return -1;

        int ceil = -1;
        while(root != null){
            if(root.data = key) return root.data;

            if(key<root.data){
                ceil = root.data;
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return ceil;
    }

}