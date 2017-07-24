package tree.algorithm;

public class SearchInBST {
	
	class TreeNode {
		public int key;
		public TreeNode left;
		public TreeNode right;
		public TreeNode (int key) {
			this.key = key;
		}
	}
	
	public TreeNode search(TreeNode root, int target) {
		if (root == null) {
			return root;
		}
		TreeNode cur = root;
		while (cur != null && cur.key != target) {
			if (cur.key < target) {
				cur = cur.right;
			} else {
				cur = cur.left;
			}
		}
		return cur;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
