class Solution {
    public double findMaxAverage(int[] nums, int k) {
		if (nums.length == 1) return nums[0];
		double startSum = 0;
		for (int i = 0; i < k; i++) {
			startSum += nums[i];
		}
		double max = startSum / k;
		double currSum = max;
		for (int i = k; i < nums.length; i++) {
			currSum += (double) nums[i] / k;
			currSum -= (double) nums[i - k] / k;
			max = Math.max(max, currSum);
		}
		return max;
		
	}
}