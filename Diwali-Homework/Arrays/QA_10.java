import java.util.*;

public class QA_10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count1 = 0, count2 = 0;
		System.out.println("Enter the element in Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		int largest = arr[0];
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
				count1++;

			}

			if (smallest > arr[i]) {
				smallest = arr[i];
				count2++;
			}

		}

		if (count1 == n - 1) {
			System.out.println("Ascending ");
		} else if (count2 == n - 1) {
			System.out.println("Descending");
		} else {
			System.out.println("Random");
		}
	}
}
