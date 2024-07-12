class Solution {
    public int maxSubArray(int[] nums) {
        int mx_end=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
          int cur=mx_end+nums[i];
          if(nums[i]<cur)mx_end=cur;
          else mx_end=nums[i];
          ans=Math.max(ans,mx_end);
        }
        return ans;
    }
}