class Solution {
    public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, nums[0]);
		for (int i = 1; i < nums.length; i++) {
			for (var entry : map.entrySet()) {
				if (Objects.equals(target - nums[i], entry.getValue())) {
					return new int[] {entry.getKey(), i};
				}
			}
			map.put(i, nums[i]);
		}
		return new int[0];
	}
}   