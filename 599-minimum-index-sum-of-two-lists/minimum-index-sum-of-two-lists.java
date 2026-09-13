class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();

		for (int i = 0; i < list1.length; i++) {
			map1.put(list1[i], i);
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < list2.length; i++) {
			if (map1.containsKey(list2[i])) {
				int index = map1.get(list2[i]);
				min = Math.min(min, i + index);
				map2.put(list2[i], i + index);
			} 
		}

		List<String> list = new ArrayList<>();
		for (var entry : map2.entrySet()) {
			if (entry.getValue() == min) {
				list.add(entry.getKey());
			}
		}

		
		return list.toArray(new String[0]);
	}
}