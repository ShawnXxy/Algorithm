package stringandhashtable.algorithm;

public class ReverseSentence {

	public String reverse (String input) {
		if (input == null) {
			return input;
		}
		char[] arrayInput = input.toCharArray();
		reverse(arrayInput, 0, input.length() - 1);
		int start = 0;
		for (int i = 0; i < arrayInput.length; i++) {
			if (arrayInput[i] != ' ' && (i == 0 || arrayInput[i - 1] == ' ')) {
				start = i;
			}
			if (arrayInput[i] != ' ' && (i == arrayInput.length - 1 || arrayInput[i + 1] == ' ')) {
				reverse(arrayInput, start, i);
			}
		}
		int index = 0;
		for (int i = 0; i < arrayInput.length; i++) {
			if (arrayInput[i] == ' ' && (i == 0 || arrayInput[i - 1] == ' ')) {
				continue;
			}
			arrayInput[index++] = arrayInput[i];
		}
		if (index != 0 && arrayInput[index - 1] == ' ') {
			return new String(arrayInput,  0, index - 1);
		}
		return new String(arrayInput, 0, index);
	}
	private void reverse (char[] array, int start, int end) {
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
		ReverseSentence solution = new ReverseSentence();
		// test case 1:
		String input = "   I love    Summer          ! ";
		String result = solution.reverse(input);
		System.out.println(result);
	}

}
