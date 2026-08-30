class Solution {
    public String reverseWords(String s) {
		StringBuilder builder = new StringBuilder();

		String[] strings = s.trim().split(" +");
		for (int i = 0; i < strings.length; i++) {
			StringBuilder str = new StringBuilder(strings[i]);
			builder.append(str.reverse());
			if (i != strings.length - 1) {
				builder.append(" ");
			}
		}

		return builder.toString();
	}
}