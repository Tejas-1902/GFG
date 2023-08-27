class FindMax {
    int findMaximum(int[] arr, int n) {
        // code here
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            
        }return max;
    }
}
class BitonicArray
{
	public static void main(String args[])
	{
		int n=6;
		int arr[]={1,32,21,43,34,22};
		FindMax f=new FindMax();
		int res=f.findMaximum(arr,n);
		System.out.println(res);
	}
}