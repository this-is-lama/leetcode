class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
		int[] hash = new int[nums.length + 1];
		for (int num : nums) {
			hash[num]++;
		}
		List<Integer> result = new ArrayList<>();
		for (int i = 1; i < hash.length; i++) {
			if (hash[i] == 0) {
				result.add(i);
			}
		}
		return result;
	}
}