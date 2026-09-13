class Solution {
    public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> compliance = new HashMap<>();
		Map<Character, Character> isomorphic = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			if (compliance.containsKey(ch1) && compliance.get(ch1) != ch2) {
				return false;
			}
			if (isomorphic.containsKey(ch2) && isomorphic.get(ch2) != ch1) {
				return false;
			}
			compliance.put(ch1, ch2);
			isomorphic.put(ch2, ch1);

		}

		return true;
	}
}