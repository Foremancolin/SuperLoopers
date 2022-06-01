package Project01;

public class Question05 {

	public static void main(String[] args) {

		// Create a 2D array of integers. Develop a program which will calculate
		// the sum of even and odd numbers for that array.
		// oguzky7

		int[][] numbers = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 } };

		int sumEven = 0;
		int sumOdd = 0;

		int i, j;
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 6; j++) {
				if ((numbers[i][j] % 2) == 0) {
					sumEven = sumEven + numbers[i][j];

				} else if ((numbers[i][j] % 2) == 1) {
					sumOdd = sumOdd + numbers[i][j];

				}
			}

		}
		System.out.println("Sum of the even numbers: " + sumEven);
		System.out.println("Sum of the odd numbers: " + sumOdd);

	}
}

