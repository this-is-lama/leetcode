class Solution {
    public int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		char[] chars = s.toCharArray();
		int index = 0;
		while (index < chars.length && !set.contains(chars[index])) {
			set.add(chars[index]);
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
			while (left < chars.length && !set.contains(chars[left])) {
				set.add(chars[left]);
				left++;
				max = Math.max(set.size(), max);
			}
		}
		return max;
	}
}