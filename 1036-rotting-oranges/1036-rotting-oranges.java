class Solution {
  class Pair{
    int x;int y;
    Pair(int x,int y){
      this.x=x;
      this.y=y;
    }
  }
    public int orangesRotting(int[][] grid) {
        Queue<Pair>q=new ArrayDeque<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++){
          for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==2){
              q.add(new Pair(i,j));
            }
            else if(grid[i][j]==1){
              fresh++;
            }
          }
        }
        if(fresh==0)return 0;
        int time=0;
        int row[]={1,0,-1,0};
        int col[]={0,1,0,-1};
      while(!q.isEmpty()){
        int cnt=q.size();
        for(int i=0;i<cnt;i++){  
          Pair cur=q.poll();
          int curR=cur.x;
          int curC=cur.y;
          for(int k=0;k<4;k++){
            int nr = curR+row[k];
            int nc = curC+col[k];
            if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1){
              grid[nr][nc]=2;
              fresh--;
              q.add(new Pair(nr,nc));
            }
          }
        }
        time++;  
      }
      return fresh==0? time-1:-1;
    }
}