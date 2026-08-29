class Solution {
    public String longestCommonPrefix(String[] strs) {
		if (strs.length == 1) return strs[0];

		StringBuilder minPrefix = new StringBuilder();
		int minLength = Integer.MAX_VALUE;
		for (String str : strs) {
			if (str.length() < minLength) {
				minPrefix = new StringBuilder(str);
				minLength = str.length();
			}
		}
		
		while (!minPrefix.isEmpty()) {
			boolean correct = true;
			for (String str : strs) {
				if (!str.startsWith(minPrefix.toString())) {
					correct = false;
					break;
				}
			}
			if (correct) {
				break;
			}
			minPrefix.deleteCharAt(minPrefix.length() - 1);
		}
		return minPrefix.toString();
	}
}