class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int ans=0;
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
          sum+=nums[i];
          int rem=sum%k;
          if(rem<0)rem=rem+k;
          if(map.containsKey(rem)){
            ans+=map.get(rem);
            map.put(rem,map.getOrDefault(rem,0)+1);
          }
          else{
            map.put(rem,1);
          }
          
            
          
        }
        
        return ans;
        

      /*TLE  
      for(int i=0;i<n;i++){
          int cur=0;
          for(int j=i;j<n;j++){
            cur+=nums[j];
            if(cur%k==0)ans++;
          }
        }
        return ans;
        */
    }
}