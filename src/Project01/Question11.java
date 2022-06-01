package Project01;

public class Question11 {

	public static void main(String[] args) {

		String[] arr = new String[] { "Karla", "Eren", "Tahmin", "Riaz", "Rizwana", "Herbert", "Tahmin", "Rizwana",
				"Karla" + "Riaz", "Karla", "Colin", "Hedayat" };

		System.out.println("Duplicate elements in given array are the following:");
		System.out.println();
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[+j]);
			}
		}
	}
}
