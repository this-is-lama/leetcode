class Solution {
    public boolean isIsomorphic(String s, String t) {
		var sChars = s.toCharArray();
		var tChars = t.toCharArray();
		int[] sMap = new int[128];
		int[] tMap = new int[128];

		for (int i = 0; i < s.length(); i++) {
			if (sMap[sChars[i]] != tMap[tChars[i]]) {
				return false;
			}
			sMap[sChars[i]] = tMap[tChars[i]] = i + 1;
		}

		return true;
	}
}