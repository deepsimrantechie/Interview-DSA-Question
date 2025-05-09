
//this is the function or line of code checking the both tree are same or not



class Solution{
    public boolean sameTree(TreeNode p, TreNode q){
        if(p== null && q== null) return true;
        if(p== null || q== null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left,q.left)&& isSmaeTree(p.right,q.right);
    }
}