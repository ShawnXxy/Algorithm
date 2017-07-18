package breadthfirstsearch.algorithm;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LayerTraverseBinaryTree {
	
	/**
	 * Time: O(n) : iterative n nodes
	 * Space: O(n) as for worst case, all nodes in one layer and so q.size() = n
	 * @author ShawnX
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
	
	public List<List<Integer>> layerByLayer (TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		Deque<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			List<Integer> layer = new ArrayList<>();
			int size = q.size();
			for (int i = 0; i < size; i++) {
				TreeNode cur = q.poll();
				layer.add(cur.key);
				if (cur.left != null) {
					q.offer(cur.left);
				}
				if (cur.right != null) {
					q.offer(cur.right);
				}
			}
			result.add(layer);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
