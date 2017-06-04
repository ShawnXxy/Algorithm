package tree.algorithm;

public class TweakedIdenticalBinaryTree {

	/**
	 *  Determine whether two given binary trees are identical assuming any number of ¡®tweak¡¯s are allowed. A tweak is defined as a swap of the children of one node in the tree.
	 * @param args
	 */
	
	class TreeNode {
		public int key;
		public TreeNode left;
		public TreeNode right;
		public TreeNode (int key) {
			this.key = key;
		}
	}
	
	public boolean isTweakedIdentical (TreeNode one, TreeNode two) {
		if (one == null && two == null) {
			return true;
		} 
		if (one == null || two == null) {
			return false;
		}
		if (one.key != two.key) {
			return false;
		}
		return isTweakedIdentical(one.left, two.left) && isTweakedIdentical(one.right, two.right) || isTweakedIdentical(one.left, two.right) && isTweakedIdentical(one.right, two.left);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
