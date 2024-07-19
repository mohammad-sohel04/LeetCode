class Pair{
  int row, col;
  Pair(int row,int col){
    this.row=row;
    this.col=col;
  }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh=0;
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
          for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==1)fresh++;
            if(grid[i][j]==2){
              q.offer(new Pair(i,j));
            }
          }
        }
        if(fresh==0)return 0;
        int ans=0;
        while(!q.isEmpty()){
        int siz=q.size();
        for(int k=0;k<siz;k++){  
          Pair cur=q.poll();
          int i=cur.row;
          int j=cur.col;
          int r=0;int c=0;
          //System.out.println(i+" "+j);
          boolean flag=false;
          //up
          r=i-1;
          c=j;
          if(r>=0 && r<grid.length && grid[r][c]==1){
            fresh--;
            grid[r][c]=2;
            flag=true;
            q.add(new Pair(r,c));
          }
          //down
          r=i+1;
          c=j;
          if(r>=0 && r<grid.length && grid[r][c]==1){
            grid[r][c]=2;
            flag=true;
            fresh--;
            q.add(new Pair(r,c));
          }
          //left
          r=i;
          c=j-1;
          if(c>=0 && c<grid[0].length && grid[r][c]==1){
            grid[r][c]=2;
            fresh--;
            flag=true;
            q.add(new Pair(r,c));
          }
          //right
          r=i;
          c=j+1;
          if(c>=0 && c<grid[0].length && grid[r][c]==1){
            grid[r][c]=2;
            fresh--;
            flag=true;
            q.add(new Pair(r,c));
          }
          if(flag);
        }
        ans++;
        }
        //for(int row[]:grid)System.out.println(Arrays.toString(row));
        if(ans>0)ans--;
        return fresh==0 ? ans:-1;
    }
}