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
		int[] count = new int[]{0};
		countGoodNodes(root, Integer.MIN_VALUE, count);
		return count[0];
	}
	public void countGoodNodes(TreeNode root, int max, int[] count) {
		if (root.val >= max) {
			count[0]++;
			max = root.val;
		}
		if (root.left != null) {
			countGoodNodes(root.left, max, count);
		}
		if (root.right != null) {
			countGoodNodes(root.right, max, count);
		}
	}
}