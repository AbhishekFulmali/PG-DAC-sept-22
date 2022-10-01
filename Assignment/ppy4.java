

 class ppy4 {

    public static void main(String[] args) {
        
         int k=0;
         for(int i=1;i<=9;i++)
		 {
			 for(int j=1;j<=9-i;j++)
			 {
				 System.out.print(" ");
			 }
			 for( k=1;k<=i;k++)
			 {
				 System.out.print(k+"");
			 }
			 for(int m=i-1;m>=1;m--)
			 {
				 System.out.print(m);
			 }
			 
			 System.out.println();
		 }
        
		
  }
}
