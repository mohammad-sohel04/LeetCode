class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int x:nums1){
          map.put(x,map.getOrDefault(x,0)+1);
        }
        //System.out.println(map);
        List<Integer>list=new ArrayList<>();
        for(int x:nums2){
          if(map.containsKey(x)){
            list.add(x);
            int val=map.get(x)-1;
            if(val>0){
              map.put(x,val);
            }
            else{
              map.remove(x);
            }
          }
        }
        //System.out.println(map);
        int ans[]=new int[list.size()];
        int i=0;
        for(Integer x:list){
          ans[i++]=x;
        }
        return ans;
    }
}