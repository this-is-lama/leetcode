class Solution {
    public List<Integer> getRow(int rowIndex) {
		int[][] cache = new int[rowIndex + 1][rowIndex + 1];
		List<Integer> row = new LinkedList<>();

		for (int columnIndex = 0; columnIndex <= rowIndex; columnIndex++) {
			row.add(element(rowIndex, columnIndex, cache));
		}

		return row;
	}

	public int element(int row, int column, int[][] cache) {
		if (column == 0 || row == column) return 1;
		if (cache[row][column] != 0) {
			return cache[row][column];
		}
		
		int result = element(row - 1, column - 1, cache) + element(row - 1 , column, cache);
		cache[row][column] = result;
		return result;
	}
}