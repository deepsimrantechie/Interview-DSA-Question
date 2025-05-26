class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        if(row==0) return;
        int col = board[0].length;

        //create the boolean array 
        boolean[][] vis = new boolean[row][col];
        //ietartion in the
        for(int i=0;i<row;i++){
            if(board[i][0]=='O')dfs(board,vis,i,0);
            if(board[i][col-1]=='O')dfs(board,vis,i,col-1);
        }
        for(int j=0;j<col;j++){
            if(board[0][j]=='O')dfs(board,vis,0,j);
            if(board[row-1][j]=='O')dfs(board,vis,row-1,j);
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O' &&!vis[i][j]){
                    board[i][j]='X';
                }
            }
        }

        
    }
    public void dfs(char[][]board, boolean[][] vis,int i,int j){
        int row = board.length;
        int col = board[0].length;

        if(i<0 || j<0 || i>=row|| j>=col|| board[i][j]!='O'|| vis[i][j])return;
        vis[i][j]=true;
        dfs(board,vis,i+1,j);
        dfs(board,vis,i-1,j);
        dfs(board,vis,i,j+1);
        dfs(board,vis,i,j-1);
    }
}