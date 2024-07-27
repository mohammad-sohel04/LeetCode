class Solution {
  Boolean dp[][];
    public boolean isMatch(String s, String p) {
       dp=new Boolean[s.length()+1][p.length()+1];
      //  for(boolean m[]:dp){
      //   Arrays.fill(m,false);
      //  }
       return helper(s,p,s.length()-1,p.length()-1);
    }
    boolean helper(String s,String p,int i,int j){
      if(i<0 && j<0)return true;
      if(j<0 && i>=0)return false;
      if(i<0 && j>=0){
        for(int k=0;k<=j;k++){
          if(p.charAt(k)!='*')return false;
        }
        return true;
      }
      if(dp[i][j]!=null)return dp[i][j];
      if(s.charAt(i)==p.charAt(j) ||  p.charAt(j)=='?'){
        return dp[i][j]=helper(s,p,i-1,j-1);
      }
      if(p.charAt(j)=='*'){
        return dp[i][j]=helper(s,p,i,j-1) || helper(s,p,i-1,j);
      }
      return dp[i][j]=false;

    }
}