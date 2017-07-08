package stringandhashtable.algorithm;

public class ReverseString {
	
	// Solution 1: two pointers
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
	
//	// Solution 2: recusion
//	public String reverse(String input, int left, int right) {
////		if (input == null || input.length() == 0) {
////			return input;
////		}
//		char[] array = input.toCharArray();
//		if (left >= right) {
//			return new String(array);
//		}
//		swap(array, left, right);
//		return reverse(input, left + 1, right - 1);
//	}
//	private void swap(char[] array, int left, int right) {
//		char temp = array[left];
//		array[left] = array[right];
//		array[right] = temp;
//	}
//	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString solution = new ReverseString();
		// test case 1
		String input = "abcde";
//		int left = 0, right = input.length() - 1;
		String result = solution.reverse(input);
		System.out.println(result);
	}

}
