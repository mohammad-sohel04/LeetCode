class Triplets{
  int idx, num, val;
  Triplets(int idx,int num,int val){
    this.idx=idx;
    this.num=num;
    this.val=val;
  }
}
class Solution {

    public int[] sortJumbled(int[] mapping, int[] nums) {
        Triplets arr[]=new Triplets[nums.length];
        int i=0;
        for(int x:nums){
          
            String s=Integer.toString(x);
            int cur=0;
            for(char ch:s.toCharArray()){
              cur=cur*10+mapping[ch-'0'];
            }
            arr[i++]=new Triplets(i,x,cur);
          
        }
        Arrays.sort(arr,new Comparator<Triplets>(){
          public int compare(Triplets a,Triplets b){
            if(a.val==b.val){
              return Integer.compare(a.idx,b.idx);
            }
            return Integer.compare(a.val,b.val);
          }
        });
        i=0;
        for(Triplets t:arr){
          //System.out.println(t.idx+" "+t.num+" "+t.val);
          nums[i++]=t.num;
        }

        return nums;
    }
}