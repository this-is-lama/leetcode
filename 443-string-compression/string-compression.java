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
			left = replace(chars, c, count, left);
		}
		return left;
	}


	public int replace(char[] chars, char c, int count, int left) {
		char[] substring;
		if (count == 1) {
			chars[left] = c;
			return left + 1;
		} 
		substring = (String.valueOf(c) + count).toCharArray();
		System.arraycopy(substring, 0, chars, left, substring.length);
		return left + substring.length;
	}
}