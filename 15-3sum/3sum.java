class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		Map<String, List<Integer>> sums = new HashMap<>();

		map.put(nums[0], 0);
		for (int i = 1; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int sum = nums[i] + nums[j];
				if (map.containsKey(-sum)) {
					var key = new ArrayList<>(List.of(nums[i], nums[j], -sum));
					Collections.sort(key);
					sums.put(key.toString(), key);
				}
			}
			map.put(nums[i], i);
		}

		return new ArrayList<>(sums.values());
	}
}