package Project01;

public class Question10 {

	public static void main(String[] args) {

		int[] array = { 34, 5, 264, 67, 23, 145, 63, 71, 2 };

		int max1 = array[0];
		int max2 = array[1];

		for (int y = 1; y < array.length; y++) {
			if (array[y] > max2) {
				max2 = array[y];
			}
			if (max2 > max1) {
				int temp = max1;
				max1 = max2;
				max2 = temp;
			}

		}

		System.out.println("The largest number is: " + max1);
		System.out.println("The second largest number is: " + max2);
	}
}

