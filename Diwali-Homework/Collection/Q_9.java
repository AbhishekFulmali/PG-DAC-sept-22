
class EmployeeTes
{
	int a;
	public int getNo()
	{
		return a;
	}
	public void setNo(int a)
	{
		this.a= a;
		
	}
}

public class Q_9
{
	
	static int k = 10;
	static void passPrm(int j)
	{
		System.out.println("the value of pass primtive is "+j);
		j= j+1;
	}
	
	static void passRefre(EmployeeTes emp)
	{
		EmployeeTes ref = emp;
		System.out.println("value before "+emp.getNo());
		ref.setNo(8);
	}
	
	public static void main(String args[])
	{
		EmployeeTes refn = new EmployeeTes();
		refn.setNo(9);
		passPrm(k);
		System.out.println("the value of primtive after get passed id "+ k);
		
		System.out.println("Value of property of object reference get passed "+refn.getNo());
	}
	
}