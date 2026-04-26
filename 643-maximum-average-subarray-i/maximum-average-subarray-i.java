class Solution {
    public double findMaxAverage(int[] nums, int k) {
		if (nums.length == 1) return nums[0];

		double max = 0;
		for (int i = 0; i < k; i++) {
			max += nums[i];
		}
		double sum = max;
		for (int i = k; i < nums.length; i++) {
			sum += nums[i] - nums[i - k];
			max = Math.max(max, sum);
		}
		return max / k;
	}
}