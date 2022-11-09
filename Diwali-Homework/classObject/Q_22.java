class Q_22
{
	int a=5 ;
	static int  b = 6;
	
	static void printobj()
	{
		System.out.println(a+" , "+b);       // Q_22.java:8: error: non-static variable a cannot be referenced from a static context
                
		                                     //comment a and see the output 
	}
	
	public static void main(String args[])
	{
		Q_22.printobj();
	}
}