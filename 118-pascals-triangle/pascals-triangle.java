class Solution {
    public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> curr = new ArrayList<>();
		curr.add(1);
		result.add(curr);
		if (numRows == 1) return result;
		curr = new ArrayList<>(curr);
		curr.add(1);
		result.add(curr);
		if (numRows == 2) return result;
		for (int i = 2; i < numRows; i++) {
			List<Integer> row = new ArrayList<>();
			var prev = result.get(i - 1);
			row.add(1);
			for (int index = 0; index < prev.size() - 1; index++) {
				row.add(prev.get(index) + prev.get(index + 1));
			}
			row.add(1);
			result.add(row);
		}
		return result;
	}
}