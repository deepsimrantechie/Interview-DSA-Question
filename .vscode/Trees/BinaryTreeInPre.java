

//Create a binary tree using inorder or preorder
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder == null || preorder == null || inorder.lenght!= preorder.lenght){
            return null;
        }
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0;i<inorder.lenght;i++){
            hashmap.put(inorder[i]);
        }
        return inbuildTreeInPre(inorder,0,inorder.lenght-1,preorder,0,preorder.length-1,hashmap);
        
    }

    public TreeNode buildTreePreIn(int[] inorder, int inStart, int inEnd, int[] preorder,int preStart, int prEnd, HashMap<Integer,Integer>hashmap){
            if(preStart>prEnd || inStart>inEnd){
                return null;
            }
            TreeNode root = new TreeNode(preorder[preStart]);
            int inRoot = hashmap.get(root.val);
            int numsLeft = inRoot - inStart;
             root.left = buildTreeInPre(inorder, inStart, inRoot - 1,preorder, preStart + 1, preStart + numsLeft, hashmap);
             root.right = buildTreeInPre(inorder, inRoot + 1, inEnd,preorder, preStart + numsLeft + 1, preEnd, hashmap);
        return root;
    }
}