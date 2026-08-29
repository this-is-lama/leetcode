class Solution {

    public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new LinkedList<>();

		for (int level = 0; level < numRows; level++) {
			List<Integer> row = new ArrayList<>();
			switch (level) {
				case 0 -> row.add(1);
				case 1 -> {
					row.add(1);
					row.add(1);
				}
				default -> {
					var prev = result.getLast();
					row.add(1);
					for (int i = 0; i < prev.size() - 1; i++) {
						row.add(prev.get(i) + prev.get(i + 1));
					}
					row.add(1);
				}
			}
			
			result.add(row);
		}
        
		return result;
	}
}