public class QA_18 {
    static void findDuplicates(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                        if(arr[i]==arr[j])
                        {
                            System.out.println(arr[i]+"");
                            break;
                        }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };
        int n = arr.length;
 
        findDuplicates(arr, n);
    }
}
