class Solution {
    public String reverseWords(String s) {
		int len = s.length();
		char[] result = new char[len];
		char[] str = s.toCharArray();
		int left = 0;
		int right = 0;
		int index = 0;
		while (left < len) {
			while (right < len && str[right] != ' ') {
				right++;
			}
			for (int i = right - 1; i >= left; i--) {
				result[index++] = str[i];
			}
			if (index < result.length) {
				result[index++] = ' ';
			}
			right++;
			left = right;
		}
		return new String(result);
	}
}