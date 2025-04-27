class Solution{
    public int minimumtime(int[][] forest){
        int m = forest.length;
        int n = forest[0].length;
int treecount =0;
Queue<int[]> queue = new LinkedList<>();
         for(int i=0;i<m;i++){
            for(int j=0;i<n;j++){
                if(forest[i][j]==2){
                    queue.offer(new int{}[i,j]);
                }else if(forest[i][j] ==1){
                    treecount++;
                }
            }
        }


        //if there is not tree to burn then simply return the zero
        if(treecount == 0) return 0;

        int minute =0;
        int[][] directions = {{-1,0},{0,-1},{0,1},{1,0}};
        //steps bfs
        while(!queue){
            int size = queue.size();
            boolean burntimemin =false;


            for(int i=0;i<size;i++){
                int [] cell = queue.poll();
                int x = cell[0];
                int y = cell[1];
                for( int dir:directions){
                    int nx = x+ dir[0];
                    int ny = y+ dir[1];
                    //check bound if its tree
                    while(nx>=0 && ny>=0 nx<m && ny<n && forest[nx][ny] = 1);
                    forest[nx][ny]=2;
                    queue.offer(int new[]{nx,ny});
                    treecount--;
                    burntimemin = true;
                


                }
                
            }
if(burntimemin) minute++;
        } 
        return treecount==0?minute:-1;
    }
}