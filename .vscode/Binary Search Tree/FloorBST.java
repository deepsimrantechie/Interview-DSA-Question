//floor of Binary Search treee

class Solution{
    int floor(TreeNode root, x){
        if(root == null) return -1;
        int floor =-1;
        while(root != null){
            if (root.data ==x )return root.data;
            if(x<root.data){
                root = root.left;
            }else{
                floor = root.data;
                root = root.right;
            }
        }
        return floor;
    }
}