class Solution {
    public int[] productExceptSelf(int[] nums) {
		int[] prefix = new int[nums.length];

		prefix[0] = 1;

		for (int i = 1; i < nums.length; i++) {
			prefix[i] = nums[i - 1] * prefix[i - 1];
		}
		
		int last = nums[nums.length - 1];
		nums[nums.length - 1] = 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			int curr = nums[i];
			nums[i] = last * nums[i + 1];
			last = curr;
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] *= prefix[i];
		}

		return nums;
	}
}