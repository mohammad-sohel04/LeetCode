class Solution {
  int dp[][];
    public int longestPalindromeSubseq(String s) {
      StringBuilder sb=new StringBuilder(s);
        dp=new int[s.length()+1][s.length()+1];
        // for(int row[]:dp){
        //   Arrays.fill(row,-1);
        // }
        int n=s.length();
        String s2=sb.reverse().toString();
        for(int i=0;i<=n;i++){
          for(int j=0;j<=n;j++){
            if(i==0 || j==0){
              dp[i][j]=0;
            }
          }
        }
        for(int i=1;i<=n;i++){
          for(int j=1;j<=n;j++){
            if(s.charAt(i-1)==s2.charAt(j-1)){
              dp[i][j]=1+dp[i-1][j-1];
            }
            else{
              dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
          }
        }
        return dp[n][n];
        //return helper(s,s2,s.length(),s.length());
    }
   
}