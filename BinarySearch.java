

import java.io.*;
import java.util.*;

  public class BinarySearch {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		 int n = sc.nextInt();
        while (n> 0) {
           
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter key for search:");
            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            n--;
        }
    }
}


class Solution {
    int binarysearch(int arr[], int n, int k) {
         int low=0;
         int high=n-1;
         while(low<=high)
          {
              int mid=(low+high)/2;
              if(arr[mid]==k)
                 return mid;
              else if(arr[mid]<k)
                 low=mid+1;
              else
                 high=mid-1;
          }
          return -1;
    }
}