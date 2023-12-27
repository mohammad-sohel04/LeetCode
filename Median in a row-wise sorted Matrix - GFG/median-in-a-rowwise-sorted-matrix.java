//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int mat[][], int R, int C) {
        // code here
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<R;i++){
            low=Math.min(low,mat[i][0]);
            high=Math.max(high,mat[i][C-1]);
        }
        int req=(R*C)/2;
        while(low<=high){
            int mid=(low+high)/2;
            int smallOrequal=helper(mat,mid,R,C);
            if(smallOrequal<=req){
                low=mid+1;
            }
            else{
               high=mid-1; 
            }
        }
        return low;
    }
    int helper(int[][]mat,int mid,int r,int c){
        int cnt=0;
        for(int i=0;i<r;i++){
            cnt+=ob(mat[i],mid,c);
        }
        return cnt;
    }
    int ob(int arr[],int tar,int c){
        int low=0,high=c-1;
        int   ans=c;
        while(low<=high){
          
            int mid=(low+high)/2;
            if(arr[mid]>tar){
                ans=mid;
                high=mid-1;
                
            }
            else{
                low=mid+1;
            }
        }
         return ans;
    }
}