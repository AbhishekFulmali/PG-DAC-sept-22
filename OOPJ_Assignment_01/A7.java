import java.util.Scanner;
class A7{
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number which you want to swap");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		a= a+b;
		b= a-b;
		a=a-b;
		System.out.println(" a= "+a+" b = "+b);

	}
	
}