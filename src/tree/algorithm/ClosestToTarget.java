package tree.algorithm;

public class ClosestToTarget {
	
	/**
	 * 	In a binary search tree, find the node containing the closest number to the given target number.
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
	
	public TreeNode closest (TreeNode root, int target) {
		if (root == null) {
			return root;
		}
		TreeNode result = root;
		TreeNode cur = root;
		while (cur != null) {
			if (cur.key == target) {
				return cur;
			}
			if (Math.abs(target - cur.key) < Math.abs(target - result.key)) {
				result = cur;
			}
			if (cur.key < target) {
				cur = cur.right;
			} else {
				cur = cur.left;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
