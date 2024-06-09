class Solution {
    public int maxTotalReward(int[] arr) {
        int sum=0;
        int n=arr.length;
        Arrays.sort(arr);
        for(int i:arr)sum+=i;
        int dp[]=new int [sum+1];
        Arrays.fill(dp,-1);
        return helper(arr,dp,0,0,n);
    }
    int helper(int arr[],int dp[],int i,int cur,int n){
      if(i==n)return cur;
      if(dp[cur]!=-1)return dp[cur];
      int notake=helper(arr,dp,i+1,cur,n);
      int take= 0;
      if(arr[i]>cur){
        take=helper(arr,dp,i+1,cur+arr[i],n);
      }
     
      dp[cur]=Math.max(take,notake);
      return dp[cur];
      
    }
}