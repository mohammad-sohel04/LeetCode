class Solution {
    public int singleNonDuplicate(int[] arr) {
        if(arr.length==1)return arr[0];
        if(arr[0]!=arr[1])return arr[0];
        int n=arr.length;
        if(arr[n-1]!=arr[n-2]){
          return arr[n-1];
        }
        int low=1,high=n-2;
        while(low<=high){
          int mid=(high+low)/2;
          if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
            return arr[mid];
          }
          if((mid%2==0 && arr[mid]==arr[mid-1]) || (mid%2!=0 && arr[mid]==arr[mid+1])){
            high=mid;
          }
          else{
            low=mid;
          }
        }
        return -1;
    }
}