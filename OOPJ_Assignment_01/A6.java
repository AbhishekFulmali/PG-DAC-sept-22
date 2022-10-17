import java.util.Scanner;

class A6{
         public static void main(String args[]){
			 
			 
			 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the temperature In Fahrenheit :");
			float Fah = sc.nextFloat();
			double Cel = (5*(Fah -32)/9.0);
			System.out.println("The temperature in Celsius is : "+Cel);
			 
			 
		 }
		 
}