class Solution {
    public int characterReplacement(String s, int k) {
        int ans=0;
        for(int i=0;i<s.length();i++){
          int k1=k+1;
          int maxi=0;
          int arr[]=new int[26];
          for(int j=i;j<s.length();j++){
             
             arr[s.charAt(j)-'A']++;
             maxi=Math.max(arr[s.charAt(j)-'A'],maxi);
             int change=(j-i+1)-maxi;
             if(change<=k){
              ans=Math.max(ans,(j-i)+1);
             }else break;
          }
        }
        return ans;

    }
   
}