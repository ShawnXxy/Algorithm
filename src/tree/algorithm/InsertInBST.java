package tree.algorithm;

public class InsertInBST {
	
	class TreeNode {
		public int value;
		public TreeNode left;
		public TreeNode right;
		public TreeNode (int value) {
			this.value = value;
		}
	}
	
	public TreeNode insert(TreeNode root, int key) {
		TreeNode newNode = new TreeNode(key);
		if (root == null) {
			return newNode;
		}
		
		// Solution 1: Iterative
//		TreeNode  cur = root;
//		while (cur.value != key) {
//			if (cur.value > key) {
//				if (cur.left != null) {
//					cur = cur.left;
//				} else {
//					cur.left = newNode;
//					break;
//				}
//			} else {
//				if (cur.right != null) {
//					cur = cur.right;
//				} else {
//					cur.right = newNode;
//					break;
//				}
//			}
//		}
//		return root;
		
		// Solution 2: Recursion
		if (root.value < key) {
			root.right = insert(root.right, key);
		} else if (root.value > key) {
			root.left = insert(root.left, key);
		} 
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
