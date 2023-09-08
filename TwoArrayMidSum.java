//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

  public class TwoArrayMidSum {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] ar1 = new int[n], ar2 = new int[n];
            String[] inputLine = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                ar1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                ar2[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().findMidSum(ar1, ar2, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        int arr[]=new int[2*n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            arr[j]=ar1[i];
            j++;
        }
        for(int i=0;i<n;i++)
        {
            arr[j]=ar2[i];
            j++;
        }
        Arrays.sort(arr);
        int y=arr.length/2;
        y=arr[y-1]+arr[(arr.length+1)/2];
        return y;
        
    }
}