package stringandhashtable.algorithm;

public class RightShiftByN {
	
	public String shift(String input, int n) {
		if (input == null) {
			return input;
		}
		char[] arrayInput = input.toCharArray();
		n = n % arrayInput.length;
		reverse(arrayInput, arrayInput.length - n, arrayInput.length - 1);
		reverse(arrayInput, 0, arrayInput.length - n - 1);
		reverse(arrayInput, 0, arrayInput.length - 1);
		return new String(arrayInput);
	}
	private void reverse(char[] array, int start, int end) {
		while (start <= end) {
			char temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightShiftByN solution = new RightShiftByN();
		// test case 1:
		String input = "a1b2c3";
		int n = 2;
		String result = solution.shift(input, n);
		System.out.println(result);
	}

}
