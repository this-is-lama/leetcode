class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
		
		for (int i = 0; i < nums.length; i++) {
			while (nums[i] != i + 1) {
				int temp = nums[i];
				if (nums[temp - 1] != nums[i]) {
					nums[i] = nums[temp - 1];
					nums[temp - 1] = temp;
				} else {
					break;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1) {
				result.add(i + 1);
			}
		}
		return result;
	}
}