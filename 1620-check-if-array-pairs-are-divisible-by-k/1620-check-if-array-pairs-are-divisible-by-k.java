class Solution {
    public boolean canArrange(int[] arr, int k) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    int n = arr.length/2;
    for(int x : arr)
    {
      int i = (x%k+k)%k;
      hm.put(i, hm.getOrDefault(i, 0)+1);   
    }
    for(int x : arr)
    {
       int i = (x%k+k)%k;
       if(i==0)
       {
         if(hm.get(i)%2==1)
         return false;
         continue;
       }
       Integer p = hm.get(i) ; 
       Integer q = hm.get(k-i);
       if(!Objects.equals(p, q))
       return false;   
    }

    return true;

    }
}