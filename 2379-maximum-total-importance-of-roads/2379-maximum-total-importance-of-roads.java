class Solution {
    public long maximumImportance(int n, int[][] roads) {
        //int n=5;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int row[]:roads){
          for(int x:row){
            map.put(x,map.getOrDefault(x,0)+1);
          }
        }
       ArrayList<ArrayList<Integer>>list=new ArrayList<>();
       for(Map.Entry<Integer,Integer>entry:map.entrySet()){
         int key=entry.getKey();
         int val=entry.getValue();
         ArrayList<Integer>temp=new ArrayList<>();
         temp.add(key);
         temp.add(val);
         list.add(temp);
       }
       int num=n;
       Collections.sort(list,(a,b)->(b.get(1)-a.get(1)));
       for(int i=0;i<list.size();i++){
        map.put(list.get(i).get(0),num--);
       }
       long ans=0;
       for(int i=0;i<roads.length;i++){
        ans+=map.get(roads[i][0]);
        ans+=map.get(roads[i][1]);
       }
       // System.out.print(map);
        return ans;
    }
}