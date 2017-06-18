package stringandhashtable.algorithm;

public class ReverseString {
	
	public String reverse(String input) {
		if (input == null || input.length() == 0) {
			return input;
		}
		char[] arrayInput = input.toCharArray();
		int left = 0;
		int right = arrayInput.length - 1;
		while (left < right) {
			char temp = arrayInput[left];
			arrayInput[left] = arrayInput[right];
			arrayInput[right] = temp;
			left++;
			right--;
		}
		return new String(arrayInput);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
