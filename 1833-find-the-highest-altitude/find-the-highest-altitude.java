class Solution {
    //1732. Find the Highest Altitude
	public int largestAltitude(int[] gain) {
		int max = 0;
		int height = 0;
		for (int i : gain) {
			height += i;
			max = Math.max(max, height);
		}
		return max;
	}
}