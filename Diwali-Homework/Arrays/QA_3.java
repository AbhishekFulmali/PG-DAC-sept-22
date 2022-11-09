import java.util.*;



public class QA_3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		System.out.println("Enter the element in Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the sum number");
		int num = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				sum = arr[i] + arr[j];
				if (sum == num) {
					System.out.println("{" + arr[i] + "," + arr[j] + "}");
				
				}
			}

		}

	}  
}
