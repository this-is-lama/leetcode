class Solution {
    
    public static String addBinary(String a, String b) {
		StringBuilder result = new StringBuilder();
		char[] main;
		char[] other;

		if (a.length() >= b.length()) {
			main = a.toCharArray();
			other = b.toCharArray();
		} else {
			main = b.toCharArray();
			other = a.toCharArray();
		}
		int mainPointer = main.length - 1;
		int otherPointer = other.length - 1;

		int ostatok = 0;
		while (otherPointer >= 0) {
			int num = (main[mainPointer] - '0' + other[otherPointer] - '0' + ostatok);
			ostatok = num / 2;
			result.insert(0, Character.toString(num % 2 + '0'));
			otherPointer--;
			mainPointer--;
		}
		while (mainPointer >= 0) {
			int num = (main[mainPointer] + ostatok - '0');
			ostatok = num / 2;
			result.insert(0, Character.toString(num % 2 + '0'));
			mainPointer--;
		}
		if (ostatok == 1) {
			result.insert(0, '1');
		}

		return result.toString();
	}
}