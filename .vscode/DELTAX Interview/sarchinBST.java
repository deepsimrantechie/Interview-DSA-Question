class BST {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
       while(root != null){
        if(root.data == x){
            return true;
        }else if(x<root.data){
            root = root.left;
        }else{
            root = root.right;
        }

       }
       return false;
    }
} 