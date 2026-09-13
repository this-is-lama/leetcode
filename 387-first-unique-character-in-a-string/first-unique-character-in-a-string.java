class Solution {
    public int firstUniqChar(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.merge(s.charAt(i), 1, Integer::sum);
		}
		
		char unique = '0';
		for (var entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				unique = entry.getKey();
				break;
			}
		}
		
		return s.indexOf(unique);
	}
}