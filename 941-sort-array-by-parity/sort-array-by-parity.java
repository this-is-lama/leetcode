class Solution {
    public int[] sortArrayByParity(int[] nums) {
		int even = 0;
		for (int odd = 0; odd < nums.length; odd++) {
			if (nums[odd] % 2 == 0) {
				int temp = nums[even];
				nums[even] = nums[odd];
				nums[odd] = temp;
				even++;
			}
		}
		return nums;
	}
}