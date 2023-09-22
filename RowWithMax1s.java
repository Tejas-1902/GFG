//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class RowWithMax1s {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int col=m-1;
        int row=-1;
		//travesing row by row
        for(int i=0;i<n;i++)
        {
		    //last column to first
            for(int j=col;j>=0;j--)
            {
                if(arr[i][j]==1)
                {
                    row=i;
					
					
					//we will not see same colum again
                    col--;
			    }
                else{
                    break;      //if arr[i][j]=0 then break
                }
            }
        }return row;
    }
}