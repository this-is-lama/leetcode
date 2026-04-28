class Solution {
    public int equalPairs(int[][] grid) {
		int n = grid.length;
		int[][] transpose = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				transpose[j][i] = grid[i][j];
			}
		}
		int count = 0;
		for (int[] row : grid) {
			for (int[] column : transpose) {
				if (Arrays.equals(row, column)) {
					count++;
				}
			}
		}
		return count;
	}
}