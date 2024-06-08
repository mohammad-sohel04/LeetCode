

 class Pair{
      int x,y;
      int time;
      public Pair(int x,int y,int time){
        this.x=x;
        this.y=y;
        this.time=time;
      }
  }

class Solution {
    public int orangesRotting(int[][] grid) {
        int  m=grid.length;
        int n=grid[0].length;
        

        Queue<Pair>q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
            if(grid[i][j]==2){
              q.offer(new Pair(i,j,0));
              
            }
           
            if(grid[i][j]==1){
              fresh++;
            }
          }
        }
        if(fresh==0){return 0;}
        int[]drow={-1,0,1,0};
        int[]dcol={0,1,0,-1};
        int time=0;
        while(!q.isEmpty()){
          
          int size=q.size();
          for(int k=0;k<size;k++){
            Pair cur=q.poll();
            for(int i=0;i<4;i++){
            int r=cur.x+drow[i];
            int c=cur.y+dcol[i];

            if(r>=0 && c>=0 && r<m && c<n && grid[r][c]==1){
              q.offer(new Pair(r,c,cur.time+1));
              fresh--;
              grid[r][c]=2;
            }
            
            }
          }
         time++;
          

        }
       
        return fresh==0?time-1:-1;


    }
   
}