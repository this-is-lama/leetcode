class Solution {
    public int maxOperations(int[] nums, int k) {
		Arrays.sort(nums);
		int left = 0;
		int right = nums.length - 1;
		int operations = 0;
		while (left < right) {
			if (nums[left] == k - nums[right]) {
				operations++;
				left++;
				right--;
			} else if (nums[left] > k - nums[right]) {
				right--;
			} else {
				left++;
			}
		}
		return operations;
	}
}