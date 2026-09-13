class Solution {
    public int lengthOfLongestSubstring(String s) {
		int[] map = new int[128];
		char[] chars = s.toCharArray();

		int left = 0;
		int max = 0;
        
        for (int right = 0; right < chars.length; right++) {
			left = Math.max(left, map[chars[right]]);
			map[chars[right]] = right + 1;
			max = Math.max(max, right - left + 1);
		}

		return max;
	}
}