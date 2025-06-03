class Solution {
    public boolean ValidCorner(int mat[][]) {
        int row = mat.length;
        int col = mat[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    for(int k = i+1;k<row;k++){
                        if([k][j]==1){
                            for(int l = j+1;j<col;j++){
                                if(mat[i][l]==1 && mat[l][k]==1){
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}