class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int ans=0;
        for(int x:nums)pq.add(x);
        while(pq.isEmpty()==false && k>0){
          ans=pq.poll();
          k--;
        }
        return ans; 
    }
}