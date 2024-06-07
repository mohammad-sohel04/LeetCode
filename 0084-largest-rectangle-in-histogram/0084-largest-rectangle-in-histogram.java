class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        int lmin[]=new int[n];
        int rmin[]=new int[n];
        lmin[0]=0;
        rmin[n-1]=n-1;
        Stack<Integer>st=new Stack<>();
        st.push(0);
        //lmin
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
              st.pop();
            }
            if(st.isEmpty())lmin[i]=0;
            else{
              lmin[i]=st.peek()+1;
            }
            st.push(i);
        }
        while(st.isEmpty()==false)st.pop();
        //rmin;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
          while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
            st.pop();
          }
          rmin[i]=st.isEmpty()?n-1:st.peek()-1;;
          st.push(i);
        }
        int ans=0;
        
        for(int i=0;i<n;i++){
          int h=(rmin[i]-lmin[i]) +1;
          int cur=h*arr[i];
          System.out.println(cur);
          ans=Math.max(ans ,cur);
      
        }
        return ans;
    }
}