class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
          int mid=(high+low)/2;
          if(arr[mid]==target){
            return mid;
          }
          if(arr[low]<=arr[mid]){//left sorted
            if(target>=arr[low] && target<arr[mid]){//left me target hai
              high=mid-1;
            }
            else{
              low=mid+1;
            }
          }
          else{//right sort hai
          if(target>arr[mid] && target<=arr[high]){//right me target hai
            low=mid+1;
          }
          else{
            high=mid-1;
          }

          }
         
        }
        return -1;
    }
}