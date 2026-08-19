class Solution {
    public static int[] plusOne(int[] digits) {
		Stack<Integer> stack = new Stack<>();

		boolean increment = false;
		int length = digits.length;
		for (int i = length - 1; i >= 0; i--) {
			int num = (i == length - 1 || increment) ? digits[i] + 1 : digits[i];

			if (num == 10) {
				num = 0;
				increment = true;
			} else {
				increment = false;
			}
			stack.push(num);
		}
		if (increment) stack.push(1);

		int size = stack.size();
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = stack.pop();
		}

		return result;
	}
}