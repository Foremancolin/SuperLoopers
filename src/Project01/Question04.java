package Project01;

public class Question04 {
	
	public static void main(String[] args) {

		int[][] numbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		int i, j;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				if ((numbers[i][j] % 2) == 0) {
					System.out.println(numbers[i][j]);

				}
			}
		}
	}
}

