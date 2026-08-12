class Solution {
    public int findNumbers(int[] nums) {
        return (int) Arrays.stream(nums)
				.map(num -> (int) (Math.log10(num) + 1))
				.filter(num -> num % 2 == 0)
				.count();

    }
}