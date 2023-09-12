//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class RomanToInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int getVal(char ch)
    {
        switch(ch)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
        }
    }
    public int romanToDecimal(String str) {
        // code here
        int n=str.length();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            char ch1=str.charAt(i);
            if((i+1)<n && getVal(ch1)<getVal(str.charAt(i+1)))
            {
                sum=sum-getVal(ch1);
            }
            else
            {
                sum=sum+getVal(ch1);
            }
        }return sum;
    }
}
