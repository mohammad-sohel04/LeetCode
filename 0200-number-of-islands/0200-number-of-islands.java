class Solution {
  boolean vis[][];
    public int numIslands(char[][] grid) {
        vis=new boolean[grid.length][grid[0].length];
        int ans=0;
        for(int i=0;i<grid.length;i++){
          for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='1' && !vis[i][j]){
              DFS(grid,i,j);
              ans++;
            }
          }
        }
        return ans;
    }
    void DFS(char grid[][],int i,int j){
      if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || vis[i][j]==true||grid[i][j]=='0'){
        return;
      }
      vis[i][j]=true;
      //up
      DFS(grid,i-1,j);
      //down
      DFS(grid ,i+1,j);
      //right
      DFS(grid,i,j+1);
      DFS(grid,i,j-1);
    }
}