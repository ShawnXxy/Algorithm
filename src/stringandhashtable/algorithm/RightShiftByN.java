package stringandhashtable.algorithm;

public class RightShiftByN {
	
	public String shift(String input, int n) {
		if (input == null || input.length() == 0) {
			return input;
		}
		n = n % input.length();
		char[] arrayInput = input.toCharArray();
		reverse(arrayInput, arrayInput.length - n, arrayInput.length - 1);
		reverse(arrayInput, 0, arrayInput.length - n - 1);
		reverse(arrayInput, 0, arrayInput.length - 1);
		return new String(arrayInput);
	}
	private void reverse(char[] array, int left, int right) {
		while (left < right) {
			char temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
