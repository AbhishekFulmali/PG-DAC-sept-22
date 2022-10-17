import java.util.Scanner;

class A4{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle Amount");
		float p= sc.nextFloat();
		System.out.println("Enter the Rate of Interest");
		float r = sc.nextFloat();
		System.out.println("Enter the Duration period in years");
		float D = sc.nextFloat();
		
		double SI = (((p * r * D)/100.0));
		System.out.println("Simple Interest Is = "+SI);
		
	}
}