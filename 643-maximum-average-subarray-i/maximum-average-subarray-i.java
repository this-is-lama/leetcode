class Solution {
    public double findMaxAverage(int[] nums, int k) {
		if (nums.length == 1) return nums[0];
		
		double max = 0;
		for (int i = 0; i < k; i++) {
			max += (double) nums[i] / k;
		}
		double sum = max;
		for (int i = k; i < nums.length; i++) {
			sum += (double) (nums[i] - nums[i - k]) / k;
			max = Math.max(max, sum);
		}
		return max;
	}
}