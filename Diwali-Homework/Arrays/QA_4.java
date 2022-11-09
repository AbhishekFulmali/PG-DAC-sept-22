

public class QA_4
{
	
	static void reverseArray(int a[], int n)
	{
		int b[]= new int[n];
		int j=n;
		
		for(int i=0;i<b.length;i++)
		{
			b[j-1]=a[i];
			j=j-1;
		}
		
		for(int k=0;k<b.length;k++)
		{
			System.out.print(b[k]+" ");
		}
	}
	
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};
		reverseArray(arr,arr.length);
	}
}