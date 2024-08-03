class Solution {
  boolean vis[][];
    public void setZeroes(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        vis=new boolean[m][n];
        for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
            if(mat[i][j]==0){
              helper(mat,i,j);
            }
          }
        }
        for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
            if(vis[i][j]==true){
              mat[i][j]=0;
            }
          }
        }
    }
    void helper(int mat[][],int i,int j){
      int row=i;
      for(int r=0;r<mat.length;r++){
        if(mat[r][j]!=0){
          vis[r][j]=true;
        }
      }
      for(int c=0;c<mat[0].length;c++){
        if(mat[i][c]!=0){
          vis[i][c]=true;
        }
      }
    }
}