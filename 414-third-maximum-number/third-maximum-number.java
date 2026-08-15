class Solution {
    public int thirdMax(int[] nums) {
		long m1 = Long.MIN_VALUE;
		long m2 = Long.MIN_VALUE;
		long m3 = Long.MIN_VALUE;

		for (long val : nums) {
			if (val == m1 || val == m2 || val == m3) {
				continue;
			}
			if (val > m3) {
				m1 = m2;
				m2 = m3;
				m3 = val;
			} else if (val > m2) {
				m1 = m2;
				m2 = val;
			} else if (val > m1) {
				m1 = val;
			}
		}
		if (m1 == Long.MIN_VALUE) {
			return (int) m3;
		}
		return (int) m1;
	}
}