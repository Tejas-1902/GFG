//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class InterSectionOfTwoArrays {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking count of total testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            int a[]={1,2,3,4};
			int b[]={1,2,4,8,0};
			int n=a.length;
            Solution ob = new Solution();
            // calling NumberofElementsInIntersection method
            // and printing the result
            System.out.println(ob.NumberofElementsInIntersection(a, b, n, m));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashSet<Integer> store=new HashSet<>();
        
        for(int num:b)
        {
            store.add(num);
        }
        int count=0;
        for(int num:a)
        {
            if(store.contains(num))
            {
                count++;
              store.remove(num);
            }
           
        } return count;
    }
};
