class Solution {
    public int removeElement(int[] nums, int val) {
		List<Integer> list = new ArrayList<>();
		for (int num : nums) {
			if (num != val) {
				list.add(num);
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (i < list.size()) {
				nums[i] = list.get(i);
			} else {
				break;
			}
		}
		return list.size();
	}
}