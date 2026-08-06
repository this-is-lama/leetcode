/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		countGoodNodes(root, Integer.MIN_VALUE, list);
		return list.size();
	}
	public void countGoodNodes(TreeNode root, int max, List<Integer> nodes) {
		if (root.val >= max) {
			nodes.add(root.val);
			max = root.val;
		}
		if (root.left != null) {
			countGoodNodes(root.left, max, nodes);
		}
		if (root.right != null) {
			countGoodNodes(root.right, max, nodes);
		}
	}
}