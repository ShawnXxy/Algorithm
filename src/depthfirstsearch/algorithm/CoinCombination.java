package depthfirstsearch.algorithm;

import java.util.ArrayList;
import java.util.List;

public class CoinCombination {

			/*
			 * Given a number of different denominations of coins (e.g., 1 cent, 5 cents, 10 cents, 25 cents), get all the possible ways to pay a target number of cents.
		
		Arguments
		
		coins - an array of positive integers representing the different denominations of coins, there are no duplicate numbers and the numbers are sorted by descending order, eg. {25, 10, 5, 2, 1}
		target - a non-negative integer representing the target number of cents, eg. 99
		Assumptions
		
		coins is not null and is not empty, all the numbers in coins are positive
		target >= 0
		You have infinite number of coins for each of the denominations, you can pick any number of the coins.
		Return
		
		a list of ways of combinations of coins to sum up to be target.
		each way of combinations is represented by list of integer, the number at each index means the number of coins used for the denomination at corresponding index.
		Examples
		
		coins = {2, 1}, target = 4, the return should be
		
		[
		
		  [0, 4],   (4 cents can be conducted by 0 * 2 cents + 4 * 1 cents)
		
		  [1, 2],   (4 cents can be conducted by 1 * 2 cents + 2 * 1 cents)
		
		  [2, 0]    (4 cents can be conducted by 2 * 2 cents + 0 * 1 cents)
		
		]
			 */
	
	/*
	 * 
	 * Time: O(99^4) as 4/n levels with 99 posibilities in one level at worst case
	 * Space: 
	 * 
	 */
	
	public List<List<Integer>> combo (int[] coins, int target) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> curVal = new ArrayList<>();
		helper(coins, target, 0, result, curVal);
		return result;
	}
	private void helper(int[] coins, int target, int index, List<List<Integer>> result, List<Integer> curVal) {
		if (index == coins.length - 1) {
			if (target % coins[coins.length - 1] == 0) {
				curVal.add(target / coins[coins.length - 1]);
				result.add(new ArrayList<Integer>(curVal));
				curVal.remove(curVal.size() - 1);
			}
			return;
		}
		int max = target / coins[index];
		for (int i = 0; i <= max; i++) {
			curVal.add(i);
			helper(coins, target - i * coins[index], index + 1, result, curVal);
			curVal.remove(curVal.size() - 1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinCombination solution = new CoinCombination();
		// test case 1:
		int[] coins =  new int[] {1, 5, 10, 25};
		int target = 25;
		List<List<Integer>> result = solution.combo(coins, target);
		System.out.println(result);
	}

}
