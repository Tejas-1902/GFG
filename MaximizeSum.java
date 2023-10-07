//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class  MaximizeSum{
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            
            System.out.println(obj.Maximize(a,n));
        }
        
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    
    int Maximize(int arr[], int n)
    {
	    
        // Complete the function
        Arrays.sort(arr);
         long sum = 0 ;
         long mod = sum+= (long)(Math.pow(10, 9)+7);

        for  ( int  i = 0 ; i < n  ; i++)
              sum+= ((long)i*arr[i]%mod);
             
            sum = sum%mod ; 
        
        return  (int)sum;
        
    }   
}

/*
Input : Arr[] = {5, 3, 2, 4, 1}
Output : 40
Explanation:
If we arrange the array as 1 2 3 4 5 then 
we can see that the minimum index will multiply
with minimum number and maximum index will 
multiply with maximum number. 
So 1*0+2*1+3*2+4*3+5*4=0+2+6+12+20 = 40 mod(109+7) = 40*/