class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        int left=0,right=n-1;
        if(nums[left]<nums[right])return nums[left];
        while(left<=right){
          int mid=(left+right)/2;
          if(nums[left]<=nums[mid]){
            ans=Math.min(ans,nums[left]);
           left=mid+1;
          }
          else {
            ans=Math.min(ans,nums[mid]);
            right=mid-1;
          }
        }
        return ans;
    }
}