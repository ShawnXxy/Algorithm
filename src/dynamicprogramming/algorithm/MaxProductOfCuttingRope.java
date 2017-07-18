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
		int[] result = new int[n + 1]; // result[i] represents max product at ith meters of rope
		// no cut
		result[0] = 0;
		// length is 1 meter, no cut
		result[1] = 1;
		for (int len = 2; len <= n; len++) { // len represents current length is len meters
			int product = 0;
			for (int cut = 1; cut <= len; cut++) { // cut represents current cutted length
				product = Math.max(product, cut * Math.max(len - cut, result[len - cut]));
			}
			result[len] = product;
		}
		return result[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxProductOfCuttingRope solution = new MaxProductOfCuttingRope();
		// test case 1:
		int n = 1;
		int result = solution.maxProduct(n);
		System.out.println(result);
		// test case 2:
		n = 2;
		result = solution.maxProduct(n);
		System.out.println(result);
		// test case 2:
		n = 5;
		result = solution.maxProduct(n);
		System.out.println(result);
		// test case 2:
		n = 10;
		result = solution.maxProduct(n);
		System.out.println(result);
	}

}
