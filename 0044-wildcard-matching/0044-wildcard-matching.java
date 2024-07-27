class Solution {
  int  dp[][];
    public boolean isMatch(String s, String p) {
       dp=new int[s.length()+1][p.length()+1];
       for(int m[]:dp){
        Arrays.fill(m,-1);
       }
       return helper(s,p,s.length()-1,p.length()-1)==0?false:true;
    }
    int helper(String s,String p,int i,int j){
      if(i<0 && j<0)return 1;
      if(j<0 && i>=0)return 0;
      if(i<0 && j>=0){
        for(int k=0;k<=j;k++){
          if(p.charAt(k)!='*')return 0;
        }
        return 1;
      }
      if(dp[i][j]!=-1)return dp[i][j];
      if(s.charAt(i)==p.charAt(j) ||  p.charAt(j)=='?'){
        return dp[i][j]=helper(s,p,i-1,j-1);
      }
      if(p.charAt(j)=='*'){
        return dp[i][j]=helper(s,p,i,j-1) | helper(s,p,i-1,j);
      }
      return dp[i][j]=0;

    }
}