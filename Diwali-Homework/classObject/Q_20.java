class Q_20
{
	String s;
	
	Q_20(String s)
	{
		this.s= s;
	}
	void printObj()
	{
		System.out.println(s);
	}
	
	public static void main(String args[])
	{
		Q_20 sobj = new Q_20("Abhishek is good boy");
		sobj.printObj();
	}
}