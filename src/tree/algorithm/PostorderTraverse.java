package tree.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PostorderTraverse {

	class TreeNode {
		public int key;
		public TreeNode left;
		public TreeNode right;
		public TreeNode (int key) {
			this.key = key;
		}
	}
	
	/**
	 *  Post order traverse, always print current root at last. It starts from  current root's left, right , and then current root.
	 *  So it is reverse of pre-order traverse
	 *  
	 * @param root
	 * @return
	 */
	
	public List<Integer> postorder (TreeNode root) {
		List<Integer> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		Deque<TreeNode> stack = new LinkedList<>();
		stack.offerFirst(root);
		while (!stack.isEmpty()) {
			TreeNode cur = stack.poll();
			if (cur.left != null) {
				stack.offerFirst(cur.left);
			}
			if (cur.right != null) {
				stack.offerFirst(cur.right);
			}
			result.add(cur.key);
		}
		Collections.reverse(result);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
