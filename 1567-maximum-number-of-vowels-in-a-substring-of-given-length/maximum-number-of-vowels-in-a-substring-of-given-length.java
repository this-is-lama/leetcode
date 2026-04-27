class Solution {

    Set<Character> vowels = new HashSet<>();
	
	{
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
	}

    public int maxVowels(String s, int k) {
		
		char[] chars = s.toCharArray();
		int count = 0;
		for (int i = 0; i < k; i++) {
			if (vowels.contains(chars[i])) {
				count++;
			}
		}
		int max = count;
		for (int i = k; i < chars.length; i++) {
			if (vowels.contains(chars[i])) {
				count++;
			}
			if (vowels.contains(chars[i - k])) {
				count--;
			}
			max = Math.max(max, count);
		}

		return max;
	}
}