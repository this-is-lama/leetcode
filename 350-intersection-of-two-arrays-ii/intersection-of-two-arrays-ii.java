class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
		int[] hash1 = new int[1001];
		int[] hash2 = new int[1001];
		int[] hash3 = new int[1001];

		for (int num : nums1) {
			hash1[num]++;
		}

		for (int num : nums2) {
			hash2[num]++;
		}

		int count = 0;
		for (int num : nums1) {
			int min = Math.min(hash1[num], hash2[num]);
			if (min > 0) {
				count += min;
				hash3[num] += min;
				hash1[num] = 0;
				hash2[num] = 0;
			}
		}

		int[] result = new int[count];
		int index = 0;
		for (int num = 0; num < 1001; num++) {
			while (hash3[num] > 0) {
				result[index++] = num;
				hash3[num]--;
			}
		}

		return result;
	}
}