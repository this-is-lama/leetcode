class Solution {
    public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, nums[0]);
		for (int i = 1; i < nums.length; i++) {
			if (map.containsValue(target - nums[i])) {
				for (var entry : map.entrySet()) {
					if (Objects.equals(target - nums[i], entry.getValue())) {
						return new int[] {entry.getKey(), i};
					}
				}
			}
            map.put(i, nums[i]);
		}
		return null;
	}
}   