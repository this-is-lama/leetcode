class Solution {
    public String reverseWords(String s) {
		StringBuilder builder = new StringBuilder();

		String[] strings = s.trim().split(" +");
		for (int i = strings.length - 1; i >= 0; i--) {
			builder.append(strings[i]);
			if (i != 0) {
				builder.append(" ");
			} 
			
		}
		
		return builder.toString();
	}
}