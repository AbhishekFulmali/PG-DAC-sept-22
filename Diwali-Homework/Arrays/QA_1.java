import java.util.*;

class QA_1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the element in array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}