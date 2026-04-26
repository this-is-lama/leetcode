class Solution {
    public int maxOperations(int[] nums, int k) {
		Map<Integer, Integer> hash = new HashMap<>();
		for (int i : nums) {
			hash.merge(i, 1, Integer::sum);
		}
		int result = 0;
		for (var entry : hash.entrySet()) {
			int x = entry.getKey();
			int value = entry.getValue();
			if (x == (double) k / 2) {
				result += value / 2;
			} else {
				result += Math.min(value, hash.getOrDefault(k - x, 0));
				hash.replace(x, 0);
				hash.replace(k - x, 0);
			}
		}
		return result;
	}
}