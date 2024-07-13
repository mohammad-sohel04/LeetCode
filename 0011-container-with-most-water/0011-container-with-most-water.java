class Solution {
    public int maxArea(int[] arr) {
       int ans=0;
        int left=0,right=arr.length-1;
        while(left<right){
          int width=right-left;
          int cur_area=width*Math.min(arr[left],arr[right]);
          ans=Math.max(ans,cur_area);
          if(arr[left]<arr[right]){
            left++;
          }
          else{
            right--;
          }
        }
        return ans;
    }
}