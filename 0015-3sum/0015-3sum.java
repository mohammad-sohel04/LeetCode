class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       List<List<Integer>>list=new ArrayList<>();
       for(int i=0;i<n;i++){
        if(i>0 && nums[i]==nums[i-1])continue;
        int j=i+1,k=n-1;
        
        while(j<k){
            int cur=nums[i];
            cur+=nums[j];
            cur+=nums[k];
            if(cur==0){
              List<Integer>temp=new ArrayList<>();
              temp.add(nums[i]);temp.add(nums[j]);
              temp.add(nums[k]);
              list.add(temp);
              j++;k--;
              while(j<k && nums[j]==nums[j-1])j++;
              while(j<k && nums[k]==nums[k+1])k--;

            }
            else if(cur>0)k--;
            else j++;
        }
     
       }
        return list; 
    }

}
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Arrays.sort(nums);
//         //Set<Integer>set=new HashSet<>(nums);
//         int sum=0;
//         Set<List<Integer>>list=new HashSet<>();
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//           Set<Integer>set=new HashSet<>();
//           for(int j=i+1;j<n;j++){
            
            
//               int cur=nums[i];
//               cur+=nums[j];
//               if(set.contains(0-cur)){
//                 List<Integer>temp=new ArrayList<>();
//                 temp.add(nums[i]);
//                 temp.add(nums[j]);
//                 temp.add(0-cur);
//                 list.add(temp);
              
//             }
//             else{
//               set.add(nums[j]);
//             }
//           }
//         }
//         List<List<Integer>>ans=new ArrayList<>(list);

        
//         return ans;
//     }
// }