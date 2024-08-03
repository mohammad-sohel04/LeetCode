class Solution {
    public void rotate(int[][] mat) {
      boolean vis[][]=new boolean[mat.length][mat.length];
        for(int i=0;i<mat.length;i++){
          for(int j=0;j<mat[0].length;j++){
            if(i!=j && !vis[i][j] && vis[j][i]==false){
              int temp=mat[i][j];
              mat[i][j]=mat[j][i];
              mat[j][i]=temp;
              vis[i][j]=true;
              vis[j][i]=true;
            }
          }
        }
        int n=mat.length;
        for(int i=0;i<n;i++){
          int st=0;
          int en=mat.length-1;
          while(st<en){
            int temp=mat[i][st];
            mat[i][st]=mat[i][en];
            mat[i][en]=temp;
            st++;en--;
          }
        }
    }
}