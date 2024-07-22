
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<heights.length;i++){
          map.put(heights[i],i);
        }
        System.out.println(map);
        Arrays.sort(heights);
        String ans[]=new String[n];
        int idx=0;
        for(int i=n-1;i>=0;i--){
          int index=map.get(heights[i]);
         ans[idx]=names[index];
         idx++;
        }
        return ans;
    }
}