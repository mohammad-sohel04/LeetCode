class Solution {
    boolean vis[][];
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        vis=new boolean[m][n];
        for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
            if(board[i][j]==word.charAt(0) && vis[i][j]==false){
              if(helper(board,i,j,word,0))return true;
            }
          }
        }
        return false;
    }
    boolean helper(char[][]grid,int i,int j,String s,int idx){
      if(idx==s.length())return true;
      if(i<0 || i>=grid.length || j<0 ||j>=grid[0].length || grid[i][j]!=s.charAt(idx) || vis[i][j]==true ){
        return false;
      }
      vis[i][j]=true;
      if(grid[i][j]==s.charAt(idx)){
        idx++;
      }
      //down
     boolean d= helper(grid,i+1,j,s,idx);
      //right
     boolean r= helper(grid,i,j+1,s,idx);
      //up
     boolean u= helper(grid,i-1,j,s,idx);
      //left
      boolean l=helper(grid,i,j-1,s,idx);
      vis[i][j]=false;
      return d|r|l|u;

    }
}