package tree.algorithm;

public class CheckSymmetric {
	
	class TreeNode {
		public int key;
		public TreeNode left;
		public TreeNode right;
		public TreeNode (int key) {
			this.key = key;
		}
	}
	
	public boolean isSymmetric (TreeNode root) {
		if (root == null) {
			return true;
		}
		return isSymmetric(root.left, root.right);
	}
	private boolean isSymmetric(TreeNode one, TreeNode two) {
		if (one == null && two == null) {
			return true;
		}
		if (one ==  null || two == null) {
			return false;
		}
		if (one.key != two.key) {
			return false;
		}
		return isSymmetric(one.left, two.right) && isSymmetric(one.right, two.left);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
