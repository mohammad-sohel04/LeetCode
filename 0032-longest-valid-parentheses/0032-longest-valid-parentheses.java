class Solution {
    public int longestValidParentheses(String s) {
        //TLE recursion
        int ans=0;
        int left=0,right=0;
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='('){
            left++;
          }
          else{
            right++;
          }
          if(left==right){
            ans=Math.max(ans,2*left);
          }
          else if(left<right){
            left=0;right=0;
          }
        }
        left=right=0;
        for(int i=s.length()-1;i>=0;i--){
          char ch=s.charAt(i);
          if(ch=='(')left++;
          else{
            right++;
          }
          if(left==right){
            ans=Math.max(ans,2*left);
          }
          else if(right<left){
            left=0;right=0;
          } 
        }
        return ans;

    }
}