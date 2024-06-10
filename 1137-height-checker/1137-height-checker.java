class Solution {
    public int heightChecker(int[] arr) {
        int n=arr.length;
        int ref[]=new int[n];
        int idx=0;
        for(int x:arr){
          ref[idx++]=x;
        }
        int ans=0;
        Arrays.sort(ref);
        for(int i=0;i<n;i++){
          if(ref[i]!=arr[i]){
            ans++;
          }
        }
        return ans;
    }
}