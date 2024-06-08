class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       int n=nums.length;
       Map<Integer,Integer>map=new HashMap<>();
       int cnt=0,sum=0;
       for(int i=0;i<n;i++){
        sum+=nums[i];
        //if(nums[i]==0 && cnt>=2)return true;
        cnt++;
        //int rem=
        if(cnt>=2 && sum%k==0)return true;
        else if(map.containsKey(sum%k)){
          if(i-map.get(sum%k)>=2)return true;
        }
        else{
          map.put(sum%k,i);
        }
       }
       return false;
        /*TLE
        for(int i=0;i<n;i++){
          int sum=0,count=0;
          for(int j=i;j<n;j++){
            if(count>=2 && (sum==0 || sum%k==0)){
             System.out.println(sum);
              return true;
            }  
            sum+=nums[j];
            count++;
          }
          if(count>=2 && sum%k==0)return true;
        }
        return false;
        */
    }
}