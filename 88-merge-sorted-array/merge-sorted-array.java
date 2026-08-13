class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] result = new int[m + n];

		int first = 0;
		int second = 0;
		int pointer = 0;
		
		while (first < m && second < n) {
			if (nums1[first] > nums2[second]) {
				result[pointer] = nums2[second];
				second++;
			} else {
				result[pointer] = nums1[first];
				first++;
			}
			pointer++;
		}
		
		System.arraycopy(nums1, first, result, pointer, m - first);
		System.arraycopy(nums2, second, result, pointer, n - second );
		
		System.arraycopy(result, 0, nums1, 0, result.length);
	}
}