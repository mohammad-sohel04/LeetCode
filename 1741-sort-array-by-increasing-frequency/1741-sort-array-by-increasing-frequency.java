class Pair{
  int num,freq;
  Pair(int num,int freq){
    this.num=num;
    this.freq=freq;
  }
}
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int x:nums){
          map.put(x,map.getOrDefault(x,0)+1);
        }
        Pair[]arr=new Pair[map.size()];
        int idx=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
          arr[idx++]=new Pair(entry.getKey(),entry.getValue());
        }
        Arrays.sort(arr, new Comparator<Pair>(){
          public int compare(Pair x,Pair y){
            if(x.freq==y.freq){
                return Integer.compare(y.num, x.num);
            }
           else  return Integer.compare(x.freq,y.freq);
          }
        }
        );
        idx=0;
        for(Pair p:arr){
           int x=p.num;
           int val=map.get(x);
           while(val-->0){
            nums[idx++]=x;
           }
        }
        return nums;
    }
}