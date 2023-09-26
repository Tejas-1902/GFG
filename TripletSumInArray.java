//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class TripletSumInArray
{
    public static void main (String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int A[] = {1 4 45 6 10 8};
		    int n = A.length;
		    int X = 13;
		    Solution ob=new Solution();
		    boolean ans = ob.find3Numbers(A, n, X);
		    System.out.println(ans?1:0);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       for(int j=0;j<n-2;j++)
        {
           HashSet<Integer> h=new HashSet<>();
           int t=X-A[j];
           for(int i=j+1;i<n;i++)
           {
                if(h.contains(t-A[i]))
                    return true;
                h.add(A[i]);
            
           }
        }
       return false;
    
    }
}
