import java.util.Scanner;
class task4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		byte n = in.nextByte();
		int[] arr = new int[n];
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter Number "+i+" : ");
			arr[i-1]=in.nextInt();
		}
		int ans = findmax(arr,n);
		System.out.println("The Largest element is : "+ans);
	}
	public static int findmax(int[] arr, byte n)
	{
		int max=0;
		for(int j=0;j<n;j++)
		{
			if(max < arr[j])
				max=arr[j];
		}
		return max;
	}
}
