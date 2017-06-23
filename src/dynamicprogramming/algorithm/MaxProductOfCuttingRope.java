package dynamicprogramming.algorithm;

public class MaxProductOfCuttingRope {

	/*
	 * Given a rope with positive integer-length n, how to cut the rope into m
	 * integer-length parts with length p[0], p[1], ...,p[m-1], in order to get
	 * the maximal product of p[0]*p[1]* ... *p[m-1]? m is determined by you and
	 * must be greater than 0 (at least one cut must be made). Return the max
	 * product you can have.
	 * 
	 */
	
	public int maxProduct(int n) {
		// result[] represents largest possible product at i meters
		int[] result = new int[n + 1];
		// if 0 meter, product is 0
		result[0] = 0;
		// if 1 meter, product is 1 as no need to cut
		result[1] =  1;
		for (int length = 2; length <= n; length++) { // length represents length of rope
			int product = 1;
			for (int cut = 1; cut < length; cut++) { // cut represents how long current cut at and it will start at 1 meter
				product = Math.max(product, Math.max(cut, result[cut]) * Math.max(length - cut, result[length - cut]));
			}
		}
		return result[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
