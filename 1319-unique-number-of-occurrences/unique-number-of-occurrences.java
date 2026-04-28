class Solution {

	public boolean uniqueOccurrences(int[] arr) {
		int[] counts = new int[2001];
		boolean[] repeats = new boolean[1001];
		for (int i : arr) {
			counts[i + 1000]++;
		}
		for (int count : counts) {
			if (count == 0) {
				continue;
			}
			if (repeats[count]) {
				return false;
			}
			repeats[count] = true;
		}
		return true;
	}
}