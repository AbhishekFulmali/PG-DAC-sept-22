public class QA_15 {
    public static int getMissing(int []arr,int n)
    {
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<arr.length;i++)
        {
            sum-=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,5};
        int n=arr.length;
        System.out.println(getMissing(arr,n));
    }

    
}
