//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class ArrayLeader {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0){
		    
		    //input size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //inserting elements in the array
		    for(int i=0; i<n; i++){
		        arr[] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		  
		    //calling leaders() function
		    res = obj.leaders(arr, n);
		    

		    for(int i=0; i<res.size(); i++){
		        ot.print(res.get(i)+" ");
		    }
		    
		    ot.println();
		}
		ot.close();
		
	}
}

// } Driver Code Ends


class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){     //a[]={16,17,4,3,5,2}
        // Your code here
        ArrayList<Integer> l1=new ArrayList<>();
        int current_leader=arr[arr.length-1];  //last element is always leader
        
        l1.add(current_leader);
        
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=current_leader)    //compare last element to second last element 
            {
                current_leader=arr[i];
                l1.add(current_leader);

            }
        }
       Collections.reverse(l1);  //reverse the list bcoz our o/p is 2,5,17---->17,5,2
       return l1;
    }
}
