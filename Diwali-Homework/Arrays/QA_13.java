import java.util.*;
public class QA_13 {
    static void bubblesort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
				int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
		}
	}
    static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
    public static void main(String args[])
    {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of array");
          int n=sc.nextInt();
          int arr[]=new int[n];
          System.out.println("Enter the element in Array");
          for(int i=0;i<arr.length;i++)
          {
              arr[i]=sc.nextInt();
          }
        bubblesort(arr);
        display(arr);
           
    }

}
