import java.util.*;

class QA_12
{
	static void leftRotate(int arr[],int k)
	{
		for(int i=0;i<k;i++)
		{
		int first=arr[0];
		for(int j=0;j<arr.length-1;j++)
		{
			arr[j]=arr[j+1];
		}
		arr[i]=first;
		}
		System.out.println(" Left rotate Output Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	static void rightRotate(int arr[],int k)
	{
		int j;
		for(int i=1;i<k;i++)
		{
		int first=arr[arr.length-1];
		for( j=arr.length-1;j>=1;j--)
		{
			arr[j]=arr[j-1];
		}
		  arr[j]=first;
		}
		System.out.println(" Right  rotate Output Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the element In  Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
        
        System.out.println("\n Enter the number how many time you want to rotate Array");
		int key=sc.nextInt();
		leftRotate(arr,key);
		System.out.println();
		rightRotate(arr, key);
	}
}