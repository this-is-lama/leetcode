class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		int n = nums1.length;

		Map<Long, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				long sum = (long) nums1[i] + nums2[j];
				map.merge(sum, 1, Integer::sum);
			}
		}


		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				long sum = -(nums3[i] + nums4[j]);
				count += map.getOrDefault(sum, 0);
			}
		}

		return count;
	}
}