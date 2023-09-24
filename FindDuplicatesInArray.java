//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class FindDuplicatesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        /*
        Input:
        N = 5
        a[] = {2,3,1,2,3}
        Output: 
        2 3 */
        ArrayList<Integer> fin = new ArrayList(); 
        int[] dup = new int[n];      //a[] = {2,3,1,2,3}---->dup[]={0,1,2,2,0}--0,1,2,3,4
        for (int i : arr)
        {
          dup[i]++; // Count the occurrences of each element in 'arr'
        }

      for (int i = 0; i < n; i++) 
      {
         if (dup[i] > 1) {
            fin.add(i); 
          }
      }

      if (fin.size() == 0) {
            fin.add(-1); // If no duplicates were found, add -1 to 'fin'
      }

       return fin; 

    }
}
