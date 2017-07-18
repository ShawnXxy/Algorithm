package stringandhashtable.algorithm;

public class DecompressString {

	/*
	 * Given a string in compressed form, decompress it to the original string.
	 * The adjacent repeated characters in the original string are compressed to
	 * have the character followed by the number of repeated occurrences.
	 */

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecompressString solution = new DecompressString();
		// test case 1:
		String input = null;
		String result = solution.decompress(input);
		System.out.println(result);
		// test case 2:
		input = "";
		result = solution.decompress(input);
		System.out.println(result);
		// test case 3:
		input = "a1c0b2c4";
		result = solution.decompress(input);
		System.out.println(result);
	}

}
