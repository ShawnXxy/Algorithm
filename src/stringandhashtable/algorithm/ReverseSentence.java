package stringandhashtable.algorithm;

public class ReverseSentence {

	public String reverse(String sentence) {
		if (sentence == null || sentence.length() == 0) {
			return sentence;
		}
		char[] arraySentence = sentence.toCharArray();
		// Step 1: reverse whole sentence
		reverse(arraySentence, 0, arraySentence.length - 1);
		// Step 2: reverse each word
		int start = 0;
		for (int i = 0; i < arraySentence.length; i++) {
			// find start of each word : 
			// beginning of the sentence should be start; start will not be space; previous position should be space;
			if (arraySentence[i] != ' ' && (i == 0 || arraySentence[i - 1] == ' ')) {
				start = i;
			}
			// find end of each word and reverse start to end
			if (arraySentence[i] != ' ' && (i == arraySentence.length - 1 || arraySentence[i + 1] == ' ')) {
				reverse(arraySentence, start, i);
			}
		}
		// if there are extra spaces, remove them
		int index = 0;
		for (int j = 0; j < arraySentence.length; j++) {
			if (arraySentence[j] == ' ' && (j == 0 || (arraySentence[j - 1] == ' '))) {
				continue;
			}
			arraySentence[index++] = arraySentence[j];
		}
		if (index != 0 && arraySentence[index - 1] == ' ') {
			return new String(arraySentence, 0, index - 1);
		}
		return new String(arraySentence, 0, index);
		
	}
	public void reverse(char[] array, int left, int right) {
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
