class Solution {
    public int minIncrementForUnique(int[] nums) {
        /*Set<Integer>set=new HashSet<>();
       int ans=0;
        for(int i=0;i<nums.length;i++){
          if(!set.contains(nums[i])){
            set.add(nums[i]);
          }
          else{
            int temp=nums[i];
            while(set.contains(temp)){
              temp++;
              ans++;
            }
            set.add(temp);
          }
        }
        return ans;*/
        Arrays.sort(nums);
        int ans=0,ref=0;
        for(int i=0;i<nums.length;i++){
          ref=Math.max(ref,nums[i]);
          ans+=ref-nums[i];
          ref++;
        }
        return ans;
    }
}