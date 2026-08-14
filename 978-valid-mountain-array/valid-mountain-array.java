class Solution {
    public static boolean validMountainArray(int[] arr) {
		if (arr.length < 3) return false;

		int index = 1;
		boolean increasing = false;
		boolean decreasing = false;
		while (index < arr.length && arr[index] > arr[index - 1]) {
			index++;
			increasing = true;
		}
		
		while (index < arr.length && arr[index] < arr[index - 1]) {
			index++;
			decreasing = true;
		}


		return index == arr.length && increasing && decreasing;
	}
}