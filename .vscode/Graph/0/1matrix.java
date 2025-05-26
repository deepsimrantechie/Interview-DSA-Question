class Solution {
    public int[][] updateMatrix(int[][] mat) {
                int row = mat.length;
        int col = mat[0].length;
        int[][] result = new int[row][col];
        //assigning valus
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    result[i][j]=0;
                }else{
                    result[i][j]=Integer.MAX_VALUE-100000;
                }
            }
        }

        //iteration from top to down
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i>0){
                    result[i][j]=Math.min(result[i][j],result[i-1][j]+1);
                }
                if(j>0){
                    result[i][j]=Math.min(result[i][j],result[i][j-1]+1);
                }
            }
        }

        //iteration from ottom to top
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                if(i<row-1){
                    result[i][j]=Math.min(result[i][j],result[i+1][j]+1);
                }
                if(j<col-1){
                    result[i][j]=Math.min(result[i][j],result[i][j+1]+1);
                }
            }
        }
        return result;
        
    }
}