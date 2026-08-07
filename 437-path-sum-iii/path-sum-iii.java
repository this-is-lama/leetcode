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
    public int pathSum(TreeNode root, int targetSum) {
		if (root == null) return 0;

		return countPathSum(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
	}
	public int countPathSum(TreeNode root, long targetSum) {
		if (root == null) return 0;

		targetSum -= root.val;

		int count = targetSum == 0 ? 1 : 0;
		count += countPathSum(root.left, targetSum);
		count += countPathSum(root.right, targetSum);
		return count;
	}
}