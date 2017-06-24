package tree.algorithm;

public class SearchInBST {
	
	class TreeNode {
		public int value;
		public TreeNode left;
		public TreeNode right;
		public TreeNode(int value) {
			this.value = value;
		}
	}
	
	public TreeNode search (TreeNode root, int target) {
		if (root == null || root.value == target) {
			return root;
		}
		
		// Solution 1: Recursion
//		 if (root.value < target) {
//			return search(root.right, target);
//		} else  {
//			return search(root.left, target);
//		}
		
		// Solution 2: Iterative
		TreeNode cur = root;
		while (cur != null && cur.value != target) {
			if (cur.value < target) {
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
