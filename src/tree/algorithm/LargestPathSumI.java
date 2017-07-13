package tree.algorithm;

public class LargestPathSumI {
	
	/*
	 *  Largest path sum in a binary tree from one leaf node to another leaf node
	 */
	
	class TreeNode {
		public int key;
		public TreeNode left;
		public TreeNode right;
		public TreeNode (int key) {
			this.key = key;
		}
	}
	
	public int sum (TreeNode root) {
		// assume root is not null
		int result = root.key;
		int leftSum = sum(root.left);
		int rightSum = sum(root.right);
		if (root.left != null && root.right != null) {
			
		}
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
