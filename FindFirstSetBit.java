//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class FindFirstSetBit {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}

class Solution
{
    public static int getFirstSetBit(int n){
        
        // approach 1:
       if (n == 0) {
            return 0; // Special case: 0 has no set bits.
        }
        
        int position = 1;
        
        // Find the least significant set bit by repeatedly right-shifting the number.
        while ((n & 1) == 0) {
            n >>= 1;
            position++;
        }
        
        return position;
		
		
		
    
            
    }
}
/*
// approach 1:
 int n=5;
     int i=0;
     while((n & 1)==1)
     {
    	
    		n=n>>1;
    		i++;
    		
    }System.out.println(i);
     }

*/