class Solution {
    public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> compliance = new HashMap<>();
		Map<Character, Character> isomorphic = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (compliance.containsKey(s.charAt(i))) {
				char ch = compliance.get(s.charAt(i));
				if (ch != t.charAt(i)) {
					return false;
				}
			} else if (isomorphic.containsKey(t.charAt(i))) {
				char ch = isomorphic.get(t.charAt(i));
				if (ch != s.charAt(i)) {
					return false;
				}
			} else {
				compliance.put(s.charAt(i), t.charAt(i));
				isomorphic.put(t.charAt(i), s.charAt(i));
			}
		}

		return true;
	}
}