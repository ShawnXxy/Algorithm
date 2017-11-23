package tree.algorithm;

public class InsertInBST {
	
	class TreeNode {
		public int key;
		public TreeNode left;
		public TreeNode right;
		public TreeNode(int key) {
			this.key = key;
		}
	}
	
	public TreeNode insert(TreeNode root, int value) {
		if (root == null) {
			return new TreeNode(value);
		}
		TreeNode cur = root;
		while (cur.key != value) {
			if (cur.key > value) {
				if (cur.left != null) {
					cur = cur.left;
				} else {
					cur.left = new TreeNode(value);
					break;
				}
			} else {
				if (cur.right != null) {
					cur = cur.right;
				} else {
					cur.right = new TreeNode(value);
					break;
				}
			}
		}
		return root;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
