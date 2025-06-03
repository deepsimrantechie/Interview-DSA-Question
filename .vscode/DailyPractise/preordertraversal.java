import java.util.*;

class Solution {
    static int index = 0;
    static List<Integer> leafNode = new ArrayList<>();

    public ArrayList<Integer> leafNodes(int[] preorder) {
        index = 0;
        leafNode.clear();
        build(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new ArrayList<>(leafNode);
    }

    public static Integer build(int[] preorder, int min, int max) {
        if (index >= preorder.length || preorder[index] < min || preorder[index] > max) {
            return null;
        }

        int rootVal = preorder[index++];
        Integer left = build(preorder, min, rootVal);
        Integer right = build(preorder, rootVal, max);

        if (left == null && right == null) {
            leafNode.add(rootVal);
        }

        return rootVal;
    }
}