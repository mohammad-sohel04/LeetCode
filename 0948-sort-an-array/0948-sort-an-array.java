class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int x:nums){
          pq.add(x);
        }
        int idx=0;
        while(pq.isEmpty()==false){
          nums[idx++]=pq.poll();
        }
        return nums;
    }
}