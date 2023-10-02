//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class MaximumKNegotiation {
	public static void main(String[] args)
	{
	        int[] arr = {5, -2, 5, -4, 5, -12, 5, 5, 5, 20};
	        int n = arr.length;
                int k=5;
	        // Your code goes here  
	        Arrays.sort(arr);

	         // Negate the smallest K elements
	         int i = 0;
	         while (k > 0 && i < n && arr[i] < 0) {
	             arr[i] = -arr[i];
	             k--;
	             i++;
	         }

	         // If K is still greater than 0 and even, keep negating any element with the smallest absolute value
	         if (k > 0 && k % 2 != 0) {
	             Arrays.sort(arr); 
	             arr[0] = -arr[0];
	         }

	         // Calculate the sum of the modified array
	         long sum = 0;
	         for (long num : arr) {
	             sum += num;
	         }

	         

	       System.out.println(sum);
    }
}
