package stringandhashtable.algorithm;

public class ReverseString {
	
	public String reverse (String input) {
		if (input == null) {
			return null;
		}
		char[] arrayInput = input.toCharArray();
		int start = 0;
		int end = input.length() - 1;
		while (start <= end) {
			swap(arrayInput, start++, end--);
		}
		return new String(arrayInput);
	}
	private void swap(char[] array, int a, int b) {
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString solution = new ReverseString();
		// test case 1
		String input = "abcd";
//		int left = 0, right = input.length() - 1;
		String result = solution.reverse(input);
		System.out.println(result);
	}

}
