//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class ArraysEqual{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t>0)
		{
		  int n=sc.nextInt();
		  long arr[]={1,3,5};
		  long brr[]={1,3,5};
		  
		  
		  Solution ob = new Solution();
		  System.out.println(ob.check(arr,brr,n)==true?"1":"0");
		  
		  
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        if (A.length != B.length)
            return false;
 
        
        Arrays.sort(A);
		
        Arrays.sort(B);
 
        // Linearly compare elements
        for (int i = 0; i < N; i++)
            if (A[i] != B[i])
                return false;
 
        // If all elements were same.
        return true;
        
    }
}