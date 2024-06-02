class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int n=n1+n2;
        int arr[]=new int[n];
        int i=0,j=0,idx=0;
        while(i<n1 && j<n2){
          if(nums1[i]==nums2[j]){
            arr[idx++]=nums1[i];
            arr[idx++]=nums2[j];
            i++;j++;
          }
          else if(nums1[i]<nums2[j]){
            arr[idx++]=nums1[i];i++;
          }
          else {
            arr[idx++]=nums2[j];j++;
          }
        }
        while(i<n1){
          arr[idx++]=nums1[i++];
        }
        while(j<n2){
          arr[idx++]=nums2[j++];
        }
        return n%2==0?((double)arr[n/2]+arr[n/2-1])/2.0:(double)arr[n/2];
    }
}