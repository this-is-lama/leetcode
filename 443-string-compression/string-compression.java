class Solution {
    public int compress(char[] chars) {
		int left = 0;
		int right = 0;
		while (right < chars.length) {
			char c = chars[right];
			int count = 1;
			right++;
			while (right < chars.length && chars[right] == c) {
				count++;
				right++;
			}
			left = replace(chars, crateSubstring(c, count), left);
		}
		return left;
	}

	public char[] crateSubstring(char c, int count) {
		if (count == 1) {
			return new char[]{c};
		}
		return (String.valueOf(c) + count).toCharArray();
	}

	public int replace(char[] chars, char[] substring, int left) {
		System.arraycopy(substring, 0, chars, left, substring.length);
		return left + substring.length;
	}
}