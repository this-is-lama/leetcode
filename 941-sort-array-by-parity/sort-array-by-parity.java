class Solution {
    public static int[] sortArrayByParity(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int[] result = new int[nums.length];
		for (int num : nums) {
			if (num % 2 == 0) {
				result[left++] = num;
			} else {
				result[right--] = num;
			}
		}
		return result;
	}
}