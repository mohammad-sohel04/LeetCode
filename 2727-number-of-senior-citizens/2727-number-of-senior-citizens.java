class Solution {
    public int countSeniors(String[] details) {
        int ans=0;
        for(String str:details){
          int x = Integer.parseInt(str.substring(11,13));
          if(x>60){
            ans++;
          }
        }
        return ans;
    }
}