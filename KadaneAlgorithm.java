public class Kadanes {

	public static void main(String[] args) {

		        long arr[]= {1,2,3,-2,5};
		        long n=arr.length;
		        // Your code here
		        long meh=0;  //maximum end here
		        long msf=-1;    //maximum so far
		        for(int i=0;i<n;i++)
		        {
		            meh=meh+arr[i];
		            if(meh<arr[i])
		                meh=arr[i];
		            if(msf<meh)
		                msf=meh;
		        }System.out.println(msf);;
		        
		        
		    }
		  }


