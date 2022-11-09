

class QA_6 {
	static void thirdLargest(int arr[], int size) {
		if (size < 3) {
			System.out.println("Invalid Input");
			return;
		}

		int first = arr[0], secound = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
		for (int i = 1; i < size; i++) {
			if (arr[i] > first) {
				third = secound;
				secound = first;
				first = arr[i];
			} else if (arr[i] > secound) {
				third = secound;
				secound = arr[i];

			} else if (arr[i] > third) {
				third = arr[i];
			}
		}
		System.out.println("the third largest element is " + third);
	}

	public static void main(String args[]) {
		int arr[] = { 24, 54, 31, 16, 82, 45, 67 };
		int n = arr.length;
		thirdLargest(arr, n);

	}

}