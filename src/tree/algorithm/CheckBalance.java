package tree.algorithm;

public class CheckBalance {
	
	class TreeNode {
		public int key;
		public TreeNode left;
		public TreeNode right;
		public TreeNode (int key) {
			this.key = key;
		}
	}
	
	/**
	 *   Balanced binary tree is commonly defined as a binary tree in which the depth of the left and right subtrees of every node differ by 1 or less
	 *   
	 * @param root
	 * @return
	 */
	
	public boolean isBalance (TreeNode root) {
		if (root == null) {
			return true;
		}
		return getHeight(root) != -1;
	}
	private int getHeight (TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = getHeight(root.left);
		if (leftHeight == -1) {
			return -1;
		}
		int rightHeight = getHeight(root.right);
		if (rightHeight == -1) {
			return -1;
		}
		if (Math.abs(leftHeight - rightHeight) > 1) {
			return -1;
		}
		return Math.max(leftHeight, rightHeight) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
