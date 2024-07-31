class Solution {
  
  int dp[][];
    public int minHeightShelves(int[][] books, int width) {
        dp=new int[books.length+1][width+1];
        for(int row[]:dp) Arrays.fill(row,-1);
        int a=helper(books,width,0,0,0);
       
        return a;
    }
    int helper(int arr[][],int width,int cur,int i,int maxi){
      if(i==arr.length)return maxi;
      if(dp[i][cur]!=-1)return dp[i][cur];
      int in=Integer.MAX_VALUE;
      int ex=Integer.MAX_VALUE;
      if(arr[i][0]+cur<=width){
        in=helper(arr,width,cur+arr[i][0],i+1,Math.max(maxi,arr[i][1]));
      }
      ex=maxi+helper(arr,width,arr[i][0],i+1,arr[i][1]);
      return dp[i][cur]=Math.min(ex,in);
      
    }
}