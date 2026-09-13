class Solution {
    public int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		char[] chars = s.toCharArray();
		
		int right = 0;
		int left = 0;
		int max = 0;
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