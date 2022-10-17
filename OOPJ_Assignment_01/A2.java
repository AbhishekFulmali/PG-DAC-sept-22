import java.util.Scanner;
class A2
{
	static final double pi = 3.14;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of Circle ");
		double r = sc.nextDouble();
		double Area=pi*(r*r);
		double Cricumference = 2*pi*r;
		System.out.println("Area of circle = "+Area);
		System.out.println("Circumference of circle = "+Cricumference);

	}
}