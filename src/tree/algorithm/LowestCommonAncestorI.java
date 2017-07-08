package tree.algorithm;

public class LowestCommonAncestorI {
	
	class TreeNode {
		public int key;
		public TreeNode left;
		public TreeNode right;
		public TreeNode (int key) {
			this.key = key;
		}
	}
	
	public TreeNode LCA (TreeNode root, TreeNode one, TreeNode two) {
		if (root == null) {
			return root;
		}
		if (one == root || two == root) {
			return root;
		}
		TreeNode leftNode = LCA(root.left, one, two);
		TreeNode rightNode = LCA(root.right, one, two);
		if (leftNode != null && rightNode != null) {
			return root;
		}
		if (leftNode == null) {
			return rightNode;
		} else {
			return leftNode;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
