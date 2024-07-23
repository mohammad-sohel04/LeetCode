class Solution {
    public String longestPalindrome(String s) {
        
        int st=0,en=0;
        for(int i=0;i<s.length();i++){
          int o=helper(s,i,i);
          int e=helper(s,i,i+1);
          int maxi=Math.max(o,e);
          if(maxi>en-st){
            st=i-(maxi-1)/2;
            en=i+maxi/2;
          }
        }
        return s.substring(st,en+1);
    }
    int helper(String s,int left,int right){
      while(left>=0 && right<s.length()  && s.charAt(left)==s.charAt(right)){
        left--;right++;
      }
      return (right-left-1);
    }
}