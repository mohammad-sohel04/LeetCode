class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
          for(int j=0;j<edges[0].length;j++){
            map.put(edges[i][j],map.getOrDefault(edges[i][j],0)+1);
          }
        }
        int ans=0,cur=0;
       for(Integer k:map.keySet()){
            if(cur<map.get(k)){
              cur=map.get(k);
              ans=k;
            }
       }
        return ans;
    }
}