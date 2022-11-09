import java.util.*;
class QA_5
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
	    int arr[]= new int[n];
		System.out.println("Enter the element in array");
		
	    for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int largest =arr[0];
		int smallest=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
			{
				largest=arr[i];
			}
			if(smallest>arr[i])
			{
				smallest=arr[i];
			}
			
		}
		
	  System.out.println("Largest number is  : "+largest);
	  System.out.println("smallest number is : "+smallest);
	  
	}
}