//first approch to solve zigzag question 

//this is the most optimised way we are just using linkedlist to store the value of a sinlge level where as in second approch we will use stack in which we will do extra pop poll operation

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> zigzag = new ArrayList<>();
        if (root == null) return zigzag;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
        while(!queue.isEmpty()){
            int levelSize = queue.size();
        LinkedList<Integer> level = new LinkedList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode current = queue.poll();

                if(flag){
                    level.addLast(current.val);
                }else{
                    level.addFirst(current.val);
                }

                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
            flag = !flag;
            result.add(level);

        }
        return result;
        
    }
}


//second approch

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> zigzag = new ArrayList<>();
        if(root == null) return zigzag;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = false;
        while(!stack.isEmpty()){
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();
            stack<Integer> stack = new Stack<>();

            for(int i=0;i<levelSize;i++){
                TreeNode current = queue.poll();
                if(flag){
                    stack.push(current.val);
                }else{
                    level.add(current.val);
                }

                if(current.left != null)queue.add(current.left);
                if(current.right != null) queue.add(current.right);

            }
            flag = !flag;
            //pop all element in the stack in the reversing order 
            while(!stack.isEmpty()){
                level.add(stack.pop());
            }
            zigzag.add(level);
        }
        return zigzag;
        
    }
}