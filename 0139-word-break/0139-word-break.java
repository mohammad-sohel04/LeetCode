class Solution {
  int dp[];
    public boolean wordBreak(String s, List<String> wordDict) {
       dp=new int [s.length()+1];
       Arrays.fill(dp,-1);
        return helper(0,s,wordDict)==1?true :false;
    }
   int helper(int i,String s,List<String>wordDict){
      if(dp[i]!=-1)return dp[i];
      if(i==s.length())return dp[i]=1;;
       
      for(int j=i;j<s.length();j++){
        if(wordDict.contains(s.substring(i,j+1))){
          if(helper(j+1,s,wordDict)==1)return dp[i]=1;;
        }
      }
      return dp[i]=0;
    }
}