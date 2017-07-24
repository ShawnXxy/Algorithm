package tree.algorithm;

public class LowestCommonAncestorI {
	
	/**
	 * 
	 * Given two nodes in a binary tree, find their lowest common ancestor.

			Assumptions
			
			There is no parent pointer for the nodes in the binary tree
			
			The given two nodes are guaranteed to be in the binary tree
	 * 
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
	
	public TreeNode LCA(TreeNode root, TreeNode one, TreeNode two) {
		if (root == null || one == root || two == root) {
			return root;
		}
		TreeNode left = LCA(root.left, one, two);
		TreeNode right = LCA(root.right, one, two);
		if (left != null && right != null) {
			return root;
		}
		if (left == null) {
			return right;
		} else {
			return left;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
