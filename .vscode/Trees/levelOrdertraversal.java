import java.util.*;

// Definition for a binary tree node
class Node {
    int val;
    Node left, right;
    
    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

class Solution {
    public static void bfs(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll(); // Remove and get the front element
            System.out.print(temp.val + " ");

            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
    }
}
