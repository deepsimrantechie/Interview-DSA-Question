//sum of node of max path

class Solution{
    int maxLen =0;
    int maxSum = 0;
    public int maxPathSum(Node node){
        dfs(node,0,0);
        return maxSum;
    }
    public void dfs(Node node, int currLen,int currSum){
        if(node == null) return ;
        currLen +=1;
        currSum = node.data;

        if(node.left == null && node.right == null){
            if(currLen>maxLen){
                maxLen = currLen;
                maxSum = currSum;
            }else if(currLen == maxLen){
                maxSum = Math.max(currSum,maxSum);
            }
            return;
        }
        dfs(node.left,currLen,currSum);
        dfs(node.right,currLen,currSum);

    }
}