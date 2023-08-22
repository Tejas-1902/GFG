//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class LargestElement{
	public static void main(String[] args) throws IOException
	{
	        int a[]={1,32,21,54,21,21};
			int n=a.length;
            
            Compute obj = new Compute();
            System.out.println(obj.largest(a, n));
            
        
	}
}


class Compute {
    
    public int largest(int arr[], int n)
    {
        int max=arr[0];
      for(int i=1;i<arr.length;i++)
      {
          if(arr[i]>max)
              max=arr[i];
      }
      return max;
    }
}