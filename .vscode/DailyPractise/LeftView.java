//We have to find the left view of the tree 
import java.util.*;

class Solution{
    ArrayList<Node> leftView(TreeNode node){
        ArrayList<Integer> result = new LinkedList<>();
        if(root == null) return result;
//here we are doing level order traversal to find the level of the tree
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            for(int i=0;i<levelSize;i++){
                Node current = queue.poll();
                //we are cheking here that the we are adding always the first element of the level on which we are
                if(i==0){
                    result.add(current.data);
                }
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
        }
        return result;
    }
}