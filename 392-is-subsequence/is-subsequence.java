class Solution {
    public boolean isSubsequence(String s, String t) {
		if (s.isEmpty()) return true;
		if (t.isEmpty()) return false;

		int first = 0;
		int second = 0;
		char[] sc = s.toCharArray();
		char[] tc = t.toCharArray();
		while (first < sc.length && second < tc.length) {
			if (sc[first] == tc[second]) {
				first++;
				if (first == sc.length) return true;
			}
			second++;

		}
		return false;
	}
}