//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class ArraySubset {
	public static void main(String[] args)
	{
            long a1[]={12,13,31,42,32};
			
            long a1[]={12,13,31};
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        Map<Long,Integer> map=new HashMap<>();
        for(long x:a1)
        {
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        for(long x:a2)
        {
            if(map.containsKey(x))
            {
                if(map.get(x)==1)
                {
                    map.remove(x);
                }
                else
                {
                    map.put(x,map.get(x)-1);
                }
            }
            else
            {
                return "No";
             }
        }
        
        return "Yes";
    }
}
