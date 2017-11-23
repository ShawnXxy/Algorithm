package tree.algorithm;

public class ReverseTreeUpSideDown {

	class TreeNode {
		public int key;
		public TreeNode left;
		public TreeNode right;
		public TreeNode (int key) {
			this.key = key;
		}
	}
	
	public TreeNode reverse (TreeNode root) {
		if (root == null || root.left == null) {
			return root;
		}
		TreeNode newRoot = reverse(root.left);
		root.left.right = root.right;
		root.left.left = root;
		root.left = null;
		root.right = null;
		return newRoot;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
