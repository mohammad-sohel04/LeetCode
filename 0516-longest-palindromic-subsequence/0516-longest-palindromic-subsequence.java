class Solution {
  int dp[][];
    public int longestPalindromeSubseq(String s) {
      StringBuilder sb=new StringBuilder(s);
        dp=new int[s.length()+1][s.length()+1];
        for(int row[]:dp){
          Arrays.fill(row,-1);
        }
        return helper(s,sb.reverse().toString(),s.length(),s.length());
    }
    int helper(String s1,String s2,int i,int j){
      if(i==0 || j==0)return 0;
     if(dp[i][j]!=-1)return dp[i][j];
      if( s1.charAt(i-1)==s2.charAt(j-1)){
        return dp[i][j]=1+helper(s1,s2,i-1,j-1);
      }
      return dp[i][j]=Math.max(helper(s1,s2,i-1,j),helper(s1,s2,i,j-1));
    }
}