class Solution {
    public int countSubstrings(String s) {
      int ans=s.length();    
        for(int i=0;i<s.length();i++){
          for(int j=i;j<s.length();j++){
            if(j-i+1==1)continue;
            if(isPal(s,i,j))ans++;
          }
        }
        return ans;
    }
    boolean isPal(String s,int left,int right){
      while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
          return false;
        }
        left++;right--;
      }
      return true;
    }

}