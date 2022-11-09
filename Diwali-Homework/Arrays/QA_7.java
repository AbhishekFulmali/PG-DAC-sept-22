import java.util.*;

public class QA_7
{
	static void mergeElement(int arr1[],int arr2[],int n1,int n2,int arr3[])
	{
		int i=0,j=0,k=0;
		while(i<n1 && j<n2)
		{
			arr3[k++]=arr1[i++];
			arr3[k++]=arr2[j++];
		}

		while(i<n1)
		{
			arr3[k++]=arr1[i++];
		}
		while(j<n2)
		{
			arr3[k++]=arr2[j++];
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int arr1[] = new int[n];
		int n1=arr1.length;
		System.out.println("Enter the element in 1st  Array");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of 2nd Array");
		int s=sc.nextInt();
		int arr2[] = new int[s];
		int n2=arr2.length;
		System.out.println("Enter the element in 2nd  Array");
		
		for(int j=0;j<arr2.length;j++)
		{
			arr2[j]=sc.nextInt();
		}
		
		int arr3[]=new int[n+s];
		
		
		mergeElement(arr1,arr2,n1,n2,arr3);
       System.out.println("Merge element of Array are ");
		for(int k=0;k<n1+n2;k++)
		{
			System.out.println(arr3[k]+" ");
		}
		
	}
}