//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class ArrangingTheArray {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.Rearrange(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
	/*Input:
    N = 4
    Arr[] = {-3, 3, -2, 2}
    Output:
    -3 -2 3 2*/
    
    public void Rearrange(int a[], int n)
    {
        // Your code goes here
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(a[i]>=0)
            {
                positive.add(a[i]);
            }
            else{
                negative.add(a[i]);
            }
        }
        int pos=0;
        int neg=0;
        int index=0;
        while(neg<negative.size())
        {
            a[index++]=negative.get(neg++);
        }
        while(pos<positive.size())
        {
            a[index++]=positive.get(pos++);
        }
    }
}