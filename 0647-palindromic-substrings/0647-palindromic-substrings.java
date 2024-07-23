class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
          int odd=helper(s,i,i);
          int even=helper(s,i,i+1);
          int cur=even+odd+1;
          ans+=cur;
        }
        return ans-s.length();
    }
    int helper(String s,int left,int right){
      int cnt=0;
      while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
        left--;
        right++;
        cnt++;
      }
      return cnt;
    }
}