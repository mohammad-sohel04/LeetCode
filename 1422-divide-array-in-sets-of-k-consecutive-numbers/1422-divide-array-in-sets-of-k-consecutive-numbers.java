class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int n=nums.length;
        if(n%k!=0)return false;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
          if(nums[i]>=0 && helper(nums,k,i)==false)return false;
        }
        return true;
    }
    boolean helper(int arr[],int k,int i ){
      int cur=arr[i]+1;
      arr[i]=-1;
      int n=arr.length;
      i+=1;
      int cnt=1;
      while(i<n && cnt<k){
        if(arr[i]==cur){
          cur=arr[i]+1;
          cnt++;arr[i]=-1;
        }
        i++;
      }
      return k==cnt;
    }
}