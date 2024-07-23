class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String s:strs){
          char arr[]=s.toCharArray();
          Arrays.sort(arr);
          String t=new String(arr);
          if(map.containsKey(t)){
            List<String>temp=map.get(t);
            temp.add(s);
            map.put(t,temp);
          }
          else{
            List<String>temp=new ArrayList<>();
            temp.add(s);
            map.put(t,temp);
          }
        }
        return new ArrayList<>(map.values());
    }
}