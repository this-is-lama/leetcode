class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();

		for (String str : strs) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);

			String key = new String(chars);

			map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
		}

		for (var entry : map.entrySet()) {
			result.add(entry.getValue());
		}

		return result;
	}
}