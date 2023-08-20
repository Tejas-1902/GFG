
import java.util.*;
import java.lang.*;

class FindElementInArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int n = sc.nextInt();
		System.out.println("Enter "+ n +"Elements:");
        while (n> 0) {
           
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
			System.out.println("Enter key for search:");
            int x = sc.nextInt();
            Solution obj = new Solution();
            
            System.out.println(obj.search(arr, n, x));
        }
    }
}
// } Driver Code Ends


class Solution{
        
    static int search(int arr[], int N, int X)
    {
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==X)
              return i;
           
        }
        return -1;
        
    }
    
}
