class BinarySearch
{
	static int Searching(int[] arr,int k,int n)
	{
		int left = 0;
		int right = n-1;
		while(left <= right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==k)
			{
				return mid;
			}
			else if(arr[mid]<k)
			{
				left = mid + 1;
			}
			else
			{
				right = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5};
		int k=9;
		int n=arr.length;
		int result=Searching(arr,k,n);
		System.out.println(result);
	}
}
