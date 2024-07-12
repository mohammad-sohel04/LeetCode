class Solution {
    public void nextPermutation(int[] nums) {
        int breaker=-1;
        int n=nums.length;
        //it should sorted from last in increasing order
        for(int i= n-2;i>=0;i--){
          if(nums[i]<nums[i+1]){
            breaker=i;
            break;
          }
        }
        if(breaker==-1){
          reverse(nums,0,n-1);
          return;
        }
        for(int i=n-1;i>breaker;i--){
          if(nums[i]>nums[breaker]){
            int temp=nums[i];
            nums[i]=nums[breaker];
            nums[breaker]=temp;
            break;
          }
        }
        reverse(nums,breaker+1,n-1);
        
       
        
        
    }
    void reverse(int nums[],int st,int en){
      while(st<en){
        int temp=nums[st];
        nums[st]=nums[en];
        nums[en]=temp;
        st++;en--;
      }
    }
}