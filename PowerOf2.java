//{ Driver Code Starts
// //Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PowerOf2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());//testcases
        
        while(t-- > 0)
        {
            //input a number n
            long n = Long.parseLong(read.readLine());
            
            
            // if n is less than equal to zero then 
            //it can't be a power of 2 so we print No
            if(new Solution().isPowerofTwo(n) == true)
              System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long number){
        
        // approach 1:
          return (number > 0) && ((number & (number - 1)) == 0);
        
        //approach 2:
		
		int power=0;
        int temp=0;
        while(temp<n)
        {
            temp=(int)(Math.pow(2,power));
            power++;
            
        
        }
        if(temp==n)
            System.out.println("xxx");
          else
            System.out.println("yyy");
			
	    
		
    }
    
}