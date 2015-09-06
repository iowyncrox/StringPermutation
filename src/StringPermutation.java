public class StringPermutation {

	public static void permutation(char[] array, int currentPosition) {

		if (currentPosition == 1) {
			System.out.println(String.valueOf(array));
		} else {
			for (int i = 0; i < currentPosition; i++) {
				permutation(array, currentPosition - 1);

				if (currentPosition % 2 == 0) {
					swap(array, i, currentPosition - 1);
				} else {
					swap(array, 0, currentPosition - 1);
				}
			}
		}
	}

	private static void swap(char[] array, int i, int j) {
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		String name = "rat";
		char[] charArray = name.toCharArray();
		permutation(charArray, charArray.length);
	}
}