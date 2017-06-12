package tree.algorithm;

public class CheckBST {
	
	/*
	 * Time: O(n)
	 * Space O(height)
	 */
	
	class TreeNode {
		public int key;
		public TreeNode left;
		public TreeNode right;
		public TreeNode (int key) {
			this.key = key;
		}
	}

	public boolean isBST (TreeNode root) {
		if (root == null) {
			return true;
		}
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	private boolean isBST (TreeNode root, int min, int max) {
		if (root == null) {
			return true;
		}
		if (root.key <= min || root.key >= max) {
			return false;
		}
		return isBST(root.left, min, root.key) && isBST(root.right, root.key, max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
