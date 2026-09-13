class Solution {
    public int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		char[] chars = s.toCharArray();
		int index = 0;
		while (index < chars.length && set.add(chars[index])) {
			index++;
		}
		int max = set.size();
		int right = 0;
		int left = index;
		while (left < chars.length) {
			while (right < chars.length && set.contains(chars[left])) {
				set.remove(chars[right]);
				right++;
			}
			while (left < chars.length && set.add(chars[left])) {
				max = Math.max(set.size(), max);
				left++;
			}
		}
		return max;
	}
}