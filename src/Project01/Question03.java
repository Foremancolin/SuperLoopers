package Project01;

public class Question03 {

	public static void main(String[] args) {

		int[][] nums = { { 1, 2, 3, 4, 5 }, { 10, 20, 30, 40, 50 }, { 15, 30, 45, 60 } };
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				sum += nums[i][j];
			}
		}
		System.out.println("The sum of all Numbers = " + sum);
		System.out.println("All values using enhenced for loop");
		for (int[] num : nums) {
			for (int n : num) {
			}
		}
		System.out.println(sum);

	}
}

