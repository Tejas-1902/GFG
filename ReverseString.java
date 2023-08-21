

class ReverseString
{
    public static void main(String args[])
    {
        
            String str ="TejasYadav";
            System.out.println(new Reverse().reverseWord(str));
        
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    
    public static String reverseWord(String str)
    {
        String rev="";
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            rev=ch+rev;
            
        }return rev;
        
    }
}