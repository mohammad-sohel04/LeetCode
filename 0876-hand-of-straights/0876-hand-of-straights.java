class Solution {
    public boolean isNStraightHand(int[] arr, int k) {
        int n=arr.length;
        if(n%k!=0)return false;
        Arrays.sort(arr);
        int i=0;
        for(;i<n;i++){
          if(arr[i]>=0){
            if(!helper(arr,i,k)){
              return false;
            }
          }
        }
        return true;
    }
    public boolean helper(int arr[],int i,int k){
      int cur=arr[i]+1;
      arr[i]=-1;
      i=i+1;
      int cnt=1;
      while(i<arr.length && cnt<k){
        if(arr[i]==cur){
          cur=arr[i]+1;
          arr[i]=-1;
          cnt++;
        }
        i++;
      }
      return cnt==k;

    }

}