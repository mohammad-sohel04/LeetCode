class Solution {
    public int search(int[] arr, int target) {
        int left=0,right=arr.length-1;
        while(left<=right){
          int mid=(left+right)/2;
          if(arr[mid]==target)return mid;
          else if(arr[mid]>=arr[left]){
            if(target>=arr[left] && target<arr[mid]){
              right=mid-1;
            }
            else{
              left=mid+1;
            }
          }
          else{
            if(target<=arr[right] && target>arr[mid]){
              left=mid+1;
            }
            else{
              right=mid-1;
            }
          }
        }
        return -1;
    }
}