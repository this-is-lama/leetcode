class Solution {

	public boolean uniqueOccurrences(int[] arr) {
		Arrays.sort(arr);
		Set<Integer> set = new HashSet<>();
		
		int right = 0;
		while (right < arr.length) {
			int digit = arr[right];
			int count = 1;
			while (right < arr.length && arr[right] == digit) {
				count++;
				right++;
			}
			if (!set.add(count)) {
				return false;
			}
		}
		return true;
	}
}