//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class MaximumKNegotiation {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.maximizeSum(a, n, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {

    public static long maximizeSum(long arr[], int n, int k)
    {
        // Your code goes here  
       Arrays.sort(arr);

        int i = 0;
        while (k > 0 && i < n && arr[i] < 0) {
            arr[i] = -arr[i];
            k--;
            i++;
        }

        // If K is still greater than 0 and even, keep negating any element with the smallest absolute value
        if (k > 0 && k % 2 != 0) {
            Arrays.sort(arr); // Sort again to ensure we negate the smallest absolute value
            arr[0] = -arr[0];
        }

        // Calculate the sum 
        long sum = 0;
        for (long num : arr) {
            sum += num;
        }

        return sum;
    }
}