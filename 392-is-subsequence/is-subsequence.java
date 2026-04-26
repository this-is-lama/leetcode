class Solution {
    public boolean isSubsequence(String s, String t) {
		if (s.isEmpty()) {
			return true;
		}
		if (t.isEmpty()) {
			return false;
		}
		int first = 0;
		for (char c : t.toCharArray()) {
			if (c == s.charAt(first)) {
				first++;
				if (first == s.length()) {
					return true;
				}
			}
		}
		return false;
	}
}