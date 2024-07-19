class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        for(int i=1;i<strs.length;i++){
          s=helper(s,strs[i]);
        }
        return s;
    }
    String helper(String s,String t){
      String ans="";
      int i=0,j=0;
      while(i<s.length() && j<t.length()){
        if(s.charAt(i)==t.charAt(j)){
          ans+=s.charAt(i);
          i++;j++;

        }
        else{
          break;
        }
      }
      return ans;
    }
}