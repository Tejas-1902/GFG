class MinMax {
	public static void main(String[] args)
	{
	        long a[]={21,32,23,100,43,66,5,10};
            
        /* approach 1:   
             Arrays.sort(a);
            long min=a[0];
			long max=a[a.length -1];
        System.out.println("Maximum:"+max+" "+"Minimum:"+min);
	   */
	   //approach2:
	   long min=a[0];
	   long max=a[0];
	   for(int i=1;i<a.length;i++)
	   {
		   if(a[i]>max)
		   {
			   max=a[i];
			   System.out.println("Maximum:"+max);
		   }
		    else if(a[i]<min)
		   {
			   min=a[i];
			     System.out.println("Minimum:"+min);
		   }   
	   }
	   
	}
	
}