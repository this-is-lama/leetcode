class Solution {
    public String reverseWords(String s) {
		String result = "";

		String[] split = s.trim().split(" +");
		for (int i = 0; i < split.length; i++) {
			if (i == 0) {
				result = split[i];
			} else {
				result = split[i] + " " + result;
			}
		}

		return result;
	}
}