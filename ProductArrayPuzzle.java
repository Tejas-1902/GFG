//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class ProductArrayPuzzle{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
/*
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900*/
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long res[]=new long[n];
        long productBeforeCurrent=1;
        long productAfterCurrent=1;
        
        for(int i=0;i<n;i++)
        {
            res[i]=productBeforeCurrent;
            productBeforeCurrent=productBeforeCurrent*nums[i];
        }
        
        for(int i=n-1;i>=0;i--)
        {
            res[i]=res[i]*productAfterCurrent;
            productAfterCurrent=productAfterCurrent*nums[i];
        }
        return res;
	} 
} 
