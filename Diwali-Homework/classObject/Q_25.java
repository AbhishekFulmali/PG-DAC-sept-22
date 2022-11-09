class Q_25
{
	static int a = 5;
	static void printObj()
	{
		System.out.println("static menthod "+a);
	}
	
	static{
		System.out.println("static block "+a);
	}
	
	public static void main(String args[])
	{
		Q_25.printObj();
	}
}