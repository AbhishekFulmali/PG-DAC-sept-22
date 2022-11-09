
public class QA_2
{
	public static void main(String args[])
	{
		
		int a[]= {1,2,3};
		
		int b[]={1,2,3}; 
		
		boolean result= true;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i=i+1)
			{
				if(a[i]!=b[i])
				{
					result =false;
				}
			}
		}
		else{
			result =false;
		}
		
		if(result==true)
		{
			System.out.println("Array is equal");
		}
		else
		{
			System.out.println("Array is not equal");
		}
	}
}