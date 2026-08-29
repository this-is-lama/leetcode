class Solution {

    public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		
		for (int i = 0; i < numRows; i++) {
			List<Integer> row = new ArrayList<>();
			if (i == 0) {
				row.add(1);
				result.add(row);
				continue;
			} 
			if (i == 1) {
				row.add(1);
                row.add(1);
				result.add(row);
				continue;
			}
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