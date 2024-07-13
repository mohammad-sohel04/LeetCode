class Solution {
    public int maxProduct(int[] nums) {
        int max_end=nums[0],min_end=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
          if(nums[i]<0){
            int temp=max_end;
            max_end=min_end;
            min_end=temp;
          }
          max_end=Math.max(max_end*nums[i],nums[i]);
          min_end=Math.min(min_end*nums[i],nums[i]);
          ans=Math.max(ans,max_end);
        }
        return ans;
    }
}