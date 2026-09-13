class Solution {
    public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> compliance = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (compliance.containsKey(s.charAt(i))) {
				char ch = compliance.get(s.charAt(i));
				if (ch != t.charAt(i)) {
					return false;
				}
			} else {
				if (compliance.containsValue(t.charAt(i))) {
					return false;
				}
				compliance.put(s.charAt(i), t.charAt(i));
			}
		}

		return true;
	}
}