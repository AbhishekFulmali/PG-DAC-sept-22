import java.util.*;

public class QA_8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		int result[] = new int[n - 2];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("calculating the result ");
		for (int i = 0; i < arr.length - 2; i++) {

			for (int j = i; j <= i + 2; j++) {

				sum = sum + arr[j];
				System.out.println(sum);

			}
			int avg = (sum) / 3;
			result[i] = avg;
			sum = 0;
			avg = 0;

		}
		System.out.println("Result array is ");
		for (int k = 0; k < result.length; k++) {
			System.out.println(result[k]);
		}
	}
}