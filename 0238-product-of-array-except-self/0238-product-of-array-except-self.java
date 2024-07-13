class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul=1;
        int zero=0;
        int ans[]=new int [nums.length];
        Arrays.fill(ans,0);
        for(int x:nums){
          if(x!=0){
            mul=mul*x;
          }
          else if(x==0){
            zero++;
          }
        }
        if(zero==0){
          for(int i=0;i<nums.length;i++){
            ans[i]=mul/nums[i];
          }
        }
        else if(zero==1){
          for(int i=0;i<nums.length;i++){
            ans[i]= (nums[i]==0)?mul:0;
          }
        }
        return ans;
    }
}