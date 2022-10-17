import java.util.Scanner;
class A8{
	
	  public static void main(String args[])
	  {
		  Scanner sc = new Scanner(System.in);
		  double Bs, Gs, da, HRA;
	      System.out.println("Enter the Basic salary In Ruppes :");
	      Bs =sc.nextDouble();
		   if(Bs<10000)
		   {
			   HRA = Bs *( 10/100.0);
			   da = Bs * (90/100.0);
		   }
		   else
		   {
			   HRA = 2000;
			   da= Bs * (98/100.0);
		   }
		   
		   Gs = Bs + HRA  + da;
		   System.out.println("Basic salary Rs."+Bs);
		   System.out.println("HRA Rs"+HRA);
		   System.out.println("DA  Rs"+da);
		   System.out.println("Gross salary Rs"+Gs);
	  }
      
}