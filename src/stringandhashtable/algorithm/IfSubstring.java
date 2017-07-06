package stringandhashtable.algorithm;

public class IfSubstring {

	/*
	 * Determine if a small string is a substring of another large string.
	 * Return the index of the first occurrence of the small string in the large string.
	 * Return -1 if the small string is not a substring of the large string.
	 */
	
	public int strStr (String large, String small) {
		// assume both large and small strings are not null
		if (large.length() < small.length()) {
			return -1;
		}
		if (small.length() == 0) {
			return 0;
		}
		for (int i = 0; i <= large.length() - small.length(); i++) {
			if (equals(large, i, small)) {
				return i;
			}
		}
		return -1;
	}
	private boolean equals(String large, int index, String small) {
		for (int i = 0; i < small.length(); i++) {
			if (large.charAt(i + index) != small.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
