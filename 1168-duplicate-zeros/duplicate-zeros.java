class Solution {
    public static void duplicateZeros(int[] arr) {
		int length = arr.length;
		int[] result = new int[length];
		int first = 0;
		int second = 0;
		while (second <= length - 1) {
			if (arr[first] == 0) {
				result[second] = 0;
				second++;
                if (second == length) {
					break;
				}
				result[second] = 0;
			} else {
				result[second] = arr[first];
			}
			first++;
			second++;
		}
		System.arraycopy(result, 0, arr, 0, length);
	}
}