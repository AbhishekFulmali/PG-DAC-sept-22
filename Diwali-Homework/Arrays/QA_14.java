public class QA_14 {
    public static void main(String[] args) {
        int a[]={10,20,30};
        int b[]={10,20,31};

        boolean result=true;
        if(a.length==b.length)
             {
                 for(int i=0;i<a.length;i++)
                 {
                     if(a[i]!=b[i])
                     {
                            result=false; 
                     }
                 }
             }
             else
             {
                 result=false;
             } 
          if(result==true)
             System.out.println("Array are equal");
          else
             System.out.println("Arrray is not equal");

    }
    
}
