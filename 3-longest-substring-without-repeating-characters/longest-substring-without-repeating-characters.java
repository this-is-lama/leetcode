class Solution {
    public int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<>();
		char[] chars = s.toCharArray();

		int left = 0;
		int max = 0;

		for (int right = 0; right < chars.length; right++) {
			left = Math.max(left, map.getOrDefault(chars[right], 0));
			map.put(chars[right], right + 1);
			max = Math.max(max, right - left + 1);
		}

		return max;
	}
}