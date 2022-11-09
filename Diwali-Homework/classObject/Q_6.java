class BankAccount{
	int principle = 200,rate=4,time=2;
	void test()
	{
		Interest inner=new Interest();
		inner.display();
	} 
	class Interest
	{
		void display()
		{
			int si= (principle * rate * time)/100;
			System.out.println("Interest : "+si + " Rs");
		}
	}
	
}

public class Q_6{
	public static void main(String args[])
	{
		BankAccount  Ont = new BankAccount();
		Ont.test();
	}
}
