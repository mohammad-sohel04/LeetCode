class Solution {
    public int minimumDifference(int[] nums, int k) {
        int ans=Integer.MAX_VALUE;
        int dp[]=new int[1000001];
        for(int i=0;i<nums.length;i++){
            //int cur=nums[i];
            for(int j=i,cur=nums[i];j<nums.length;j++){
                cur=cur&nums[j];
                 ans=Math.min(Math.abs(cur-k),ans);
                
                if(k-cur>=ans || cur<=dp[j]){
                  break;
                }
                dp[j]=cur;
            }
        }
        return ans;
    }
}