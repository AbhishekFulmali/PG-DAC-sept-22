import java.util.Scanner;

class A3{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks in scale of 0 to 100");
	    System.out.println("Enter the Subject1 marks");
		float sub1= sc.nextInt();
		System.out.println("Enter the Subject2 marks");
		float sub2= sc.nextInt();
		System.out.println("Enter the Subject3 marks");
		float sub3= sc.nextInt();
		System.out.println("Enter the Subject4 marks");
		float sub4= sc.nextInt();
		System.out.println("Enter the Subject5 marks");
		float sub5 = sc.nextInt();
		if(sub1<=100 && sub2<=100 && sub3<=100 && sub4<=100 && sub5<=100)
			{
				double total =sub1+sub2+sub3+sub4+sub5;
				double Percent = ((total/500.0)*100);
				System.out.println("Percentage marks = "+Percent+"%");
			}
		
		
	}
}