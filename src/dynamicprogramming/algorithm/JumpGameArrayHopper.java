package dynamicprogramming.algorithm;

public class JumpGameArrayHopper {

	/*
	 * Given an array A of non-negative integers, you are initially positioned
	 * at index 0 of the array. A[i] means the maximum jump distance from index
	 * i (you can only jump towards the end of the array). Determine the minimum
	 * number of jumps you need to reach the end of array. If you can not reach
	 * the end of the array, return -1.
	 */
	
	public boolean jump(int[] array) {
		if (array == null || array.length == 0) {
			return true;
		}
		boolean[] canJump = new boolean[array.length];
		// iterate array from the end to start
		// last element should be reachable to end because it is already the end of the array
		for (int i = array.length - 2; i >= 0; i--) {
			// check is array.length - 2 can reach array.length - 1
			if (i + array[i] >= array.length - 1) {
				canJump[i] = true;
			} else {
				for (int j = array[i]; j >= 0; j--) {
					if (canJump[j + i]) {
						canJump[i] = true;
					}
				}
			}
		}
		return canJump[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
