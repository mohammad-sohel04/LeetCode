class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        //Set<Integer>set=new HashSet<>(nums);
        int sum=0;
        Set<List<Integer>>list=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
          Set<Integer>set=new HashSet<>();
          for(int j=i+1;j<n;j++){
            
            
              int cur=nums[i];
              cur+=nums[j];
              if(set.contains(0-cur)){
                List<Integer>temp=new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[j]);
                temp.add(0-cur);
                list.add(temp);
              
            }
            else{
              set.add(nums[j]);
            }
          }
        }
        List<List<Integer>>ans=new ArrayList<>(list);

        
        return ans;
    }
}