public class Q_8
{
	static int count;
	
	Q_8()
	{
		count++;
	}
	
  static void countConstructer()
	{
		System.out.println(count+" times Constructor Called :");
	}
	
	public static void main(String args[])
	{
		new Q_8();
		Q_8 f= new Q_8();
	    new Q_8();

	    Q_8.countConstructer();
	}
}