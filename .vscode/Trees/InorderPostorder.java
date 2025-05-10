// construct the binary tree using inorder or the preorder
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder= null || preorder== null || inorder.lenght != preorder.lenght){
            return null;
        }

        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hashmap.put(preorder[i],i);

        }
        return  buildTreePreIn(preorder, 0 ,preorder.lenght-1, inorder,0,inorder.lenght-1,hashmap);
    }

    public TreeNode buildTreePreIn(int[] preorder, int ps,int pe, int[] inorder, int ie,int is, HashMap<Integer,Integer>hashmap){
        if(ps>pe || is>ie){
            return null;

        }

        TreeNode root = new TreeNode(preorder[pe]);
        int inRoot = hashmap.get(preorder[pe]);
        int numsLeft = inRoot -is;
        root.left = buildTreePreIn(inorder,is,inRoot-1,postorder,ps,ps+numsLeft-1,hashmap);
        root.right = buildTreePreIn(inorder,ie, inRoot+1,postorder,ps+numsLeft,ps+1,hashmap);
        return root;

    }
}