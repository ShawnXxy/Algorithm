package tree.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SearchRangeInBST {

	/**
	 * Get the list of keys in a given binary search tree in a given range[min, max] in ascending order, both min and max are inclusive.
	 * @author ShawnX
	 *
	 */
	
	class TreeNode {
		public int key;
		public TreeNode left;
		public TreeNode right;
		public TreeNode (int key) {
			this.key = key;
		}
	}
	
	public List<Integer> getRange (TreeNode root, int min, int max) {
		List<Integer> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		getRange(root, min, max, result);
		return result;
	}
	private void getRange(TreeNode root, int min, int max, List<Integer> result) {
		if (root == null) {
			return;
		}
		// In BST, left < root < right
		if (root.key > min) { // root.right.key > min, no need to search in right
			 getRange(root.left, min, max, result);
		}
		if (root.key >= min && root.key <= max) {
			result.add(root.key);
		}
		if (root.key < max) { // root.left.key < max, no need to search in left
			getRange(root.right, min, max, result);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
