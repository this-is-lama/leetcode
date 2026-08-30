class Solution {
    public List<Integer> getRow(int rowIndex) {
		List<List<Integer>> result = new LinkedList<>();

		for (int level = 0; level <= rowIndex; level++) {
			List<Integer> row = new ArrayList<>();
			if (level == 0) {
				row.add(1);
			} else if (level == 1) {
				row.add(1);
				row.add(1);
			} else {
				var prev = result.getLast();
				row.add(1);
				for (int i = 0; i < prev.size() - 1; i++) {
					row.add(prev.get(i) + prev.get(i + 1));
				}
				row.add(1);
			}

			result.add(row);
		}
		return result.get(rowIndex);
	}
}