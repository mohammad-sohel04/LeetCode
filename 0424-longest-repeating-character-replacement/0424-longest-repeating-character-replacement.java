class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,right=0,ans=0,maxi=0;
        int arr[]=new int[26];
        while(right<s.length()){
          arr[s.charAt(right)-'A']++;
          maxi=Math.max(maxi,arr[s.charAt(right)-'A']);
          if((right-left+1)-maxi<=k){
            ans=Math.max(ans,(right-left)+1);
          }
          else{
            if((right-left)+1>k){
              arr[s.charAt(left)-'A']--;
              maxi=0;
              left++;
            }
          }
          right++;
        }
        return ans;
    }
}