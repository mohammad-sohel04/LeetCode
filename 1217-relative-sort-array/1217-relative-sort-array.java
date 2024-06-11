class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<arr1.length;i++){
          map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        int idx=0;
        for(int i=0;i<arr2.length;i++){
          if(map.containsKey(arr2[i])){
            int range=map.get(arr2[i]);
            while(range!=0){
              arr1[idx++]=arr2[i];
              range--;
            }
            map.remove(arr2[i],map.get(arr2[i]));
          }
        }
        //int temp[]
        if(map.size()>0){
          List<Integer>temp=new ArrayList<>();
          int ind=0;
          for(Integer x:map.keySet()){
            for(int i=0;i<map.get(x);i++){
              temp.add(x);
            }
          }
          Collections.sort(temp);
        
        for(Integer y:temp){
          arr1[idx++]=y;
        }
        }
        return arr1;
    }
}