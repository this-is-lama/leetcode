class Solution {
    public int maxVowels(String s, int k) {
		int[] vowels = new int[128];
		vowels['a']++;
		vowels['e']++;
		vowels['i']++;
		vowels['o']++;
		vowels['u']++;

		char[] chars = s.toCharArray();
		int count = 0;
		for (int i = 0; i < k; i++) {
			count += vowels[chars[i]];
		}
		int max = count;
		for (int i = k; i < chars.length; i++) {
			count += vowels[chars[i]];
			count -= vowels[chars[i - k]];
			if (count > max) {
				max = count;
			}
		}
		return max;
	}
}