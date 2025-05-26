class Solution{
    public static void dfs(int[][] image,int sr,int sc,int rows,int cols,int source,int color){
        if(sr<0 ||sr>=rows || sc<0 ||sc>=cols)return;
        if(image[sr][sc]!= source) return;
        image[sr][sc]=color;
        dfs(image,sr+1,sc,rows,cols,source,color);
        dfs(image,sr-1,sc,rows,cols,source,color);
        dfs(image,sr,sc+1,rows,cols,source,color);
        dfs(image,sr,sc-1,rows,cols,source,color);
    }
    public int[][] floodFill(int[][] image, int sr,int sc,int color){
        if(color==image[sr][sc])return image;
        int rows = image.length;
        int cols = image[0].length;
        int source = image[sr][sc];
        dfs(image , sr, sc,rows,cols,source,color);
        return image;
    }
}