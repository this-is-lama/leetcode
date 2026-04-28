class Solution {
    public boolean closeStrings(String word1, String word2) {
		int[] freq1 = new int[26];
		int[] freq2 = new int[26];
		for (char c : word1.toCharArray()) {
			freq1[c - 'a']++;
		}
		for (char c : word2.toCharArray()) {
			freq2[c - 'a']++;
		}
		int[] chars1 = new int[26];
		int[] chars2 = new int[26];
		for (int i = 0; i < 26; i++) {
			if (freq1[i] > 0 && freq2[i] > 0) {
				chars1[i] = freq1[i];
				chars2[i] = freq2[i];
			} else if (freq1[i] != 0 || freq2[i] != 0) {
				return false;
			}
		}
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		return Arrays.equals(chars1, chars2);
	}
}