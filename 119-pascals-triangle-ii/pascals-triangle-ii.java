class Solution {
    public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<>();

		for (int level = 0; level <= rowIndex; level++) {
			if (level < 2) {
				list.add(1);
			} else {
				List<Integer> newList = new ArrayList<>();
				newList.add(1);
				for (int i = 0; i < list.size() - 1; i++) {
					newList.add(list.get(i) + list.get(i + 1));
				}
				newList.add(1);
				list = newList;
			}
		}

		return list;
	}
}