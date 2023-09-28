//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class SubArrayWithGreaterSum {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            // int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.smallestSubWithSum(a, n, m));
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here 
        int left=0;
        int right=0;
        int sum=0;                  //current sum
        int shortest=Integer.MAX_VALUE;           //shortest window with sum>x 
        while(right<n)
        {
            sum=sum+a[right];                   //add current element to sum
            if(sum>x)                               //skip all element till sum<x to find smallest window
            {
                while(sum>x)                       
                {
                    sum=sum-a[left];
                    left++;
                }
                shortest=Math.min(shortest,right-left+2);           //update small window
            }right++;                                //if sum< x then move right ptr
        }
        return shortest==Integer.MAX_VALUE?0:shortest;
        
    }
}

