class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)return nums[0];
        if(nums[0]!=nums[1])return nums[0];
        int n=nums.length;
        if(nums[n-1]!=nums[n-2]){
          return nums[n-1];
        }
        int ans=0;
        for(int x:nums){
          ans^=x;
        }
        return ans;
    }
}