class Solution {
    public int maxVowels(String s, int k) {
		char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

		boolean[] hash = new boolean[26];
		for (char c : vowels) {
			hash[c - 'a'] = true;
		}
		
		char[] chars = s.toCharArray();
		int count = 0;
		for (int i = 0; i < k; i++) {
			if (hash[chars[i] - 'a']) {
				count++;
			}
			
		}
		int max = count;
		for (int i = k; i < chars.length; i++) {
			if (hash[chars[i] - 'a']) {
				count++;
			}
			
			if (hash[chars[i - k] - 'a']) {
				count--;
			}
			if (count > max) {
				max = count;
			}
		}

		return max;
	}
}