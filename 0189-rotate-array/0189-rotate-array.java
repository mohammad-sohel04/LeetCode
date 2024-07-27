class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
         if(k>n)k=k%n;

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);


    }
    void reverse(int arr[],int st,int en){
      while(st<en){
        int temp=arr[st];
        arr[st]=arr[en];
        arr[en]=temp;
        st++;en--;
      }
    }
}