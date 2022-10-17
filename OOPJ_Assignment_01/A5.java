import java.util.Scanner;

class A5{
    
       public static void main(String args[]){
		   
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Days");
		   int n = sc.nextInt();
	
		    int year = n / 365;
			n = n % 365;
			System.out.println("No. of years:"+year);
			int week = n / 7;
			n = n % 7;
			System.out.println("No. of weeks:"+week);
			int day = n;
			System.out.println("No. of days:"+day);
		   
	   }
	   


}