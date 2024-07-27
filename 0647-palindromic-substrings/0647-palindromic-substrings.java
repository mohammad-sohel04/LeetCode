class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
          int odd=helper(s,i,i);
          int even=helper(s,i,i+1);
          ans+=odd+even+1;

        }
        return ans-s.length();
    }
    int helper(String s,int left,int right){
      int cnt=0;
      while(right<s.length()&&left>=0 && s.charAt(left)==s.charAt(right)){
        cnt++;
        left--;
        right++;
      }
      return cnt;
    }
}