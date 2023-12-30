//{ Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}
// } Driver Code Ends


/*Complete the function given below*/
class Solution {
    public int maxArea(int mat[][], int n, int m) {
        // add code here.
        
        int hist[]=new int[m];
        int Maxarea=0;
      //  Arrays.fill(hist,0);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    hist[j]++;
                }
                else{
                    hist[j]=0;
                }

            }
            int area=helper(hist);
               
            Maxarea=Math.max(area,Maxarea);
            
        }
        return Maxarea;
    }
    public int helper(int[]arr){
        int area=0;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<=arr.length;i++){
            while(!st.isEmpty() && (i==arr.length || arr[st.peek()]>=arr[i])){
                int height=arr[st.peek()];
                st.pop();
                int width=0;
                if(st.isEmpty()){
                    width=i;
                }
                else{
                    width=i-st.peek()-1;
                }
                area=Math.max(area,height*width);
            }
            st.push(i);
        }
        return area;
    }
}