class Solution {
    public boolean isSubsequence(String s, String t) {
		if (s.isEmpty()) return true;
		if (t.isEmpty()) return false;

		int first = 0;
		int second = 0;
		while (first < s.length() && second < t.length()) {
			if (t.charAt(second) == s.charAt(first)) {
				first++;
				if (first == s.length()) {
					return true;
				}
			}
			second++;

		}
		return false;
	}
}