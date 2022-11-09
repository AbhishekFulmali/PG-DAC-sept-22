class Q_19
{
	
	int a, b;
	
	Q_19(int a , int b)
	{
		this.a= a;
		this.b=b;
		
	}
	void printObj()
	{
		System.out.println(a+" , "+b);
	}
	public static void main(String args[])
	{
		Q_19 obj = new Q_19(7,9);
		obj.printObj();
	}
}