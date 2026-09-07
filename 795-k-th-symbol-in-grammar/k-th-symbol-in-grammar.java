class Solution {
    public int kthGrammar(int n, int k) {
		if (n == 1) return 0;
		
		int half = (int) Math.pow(2, n - 2);
		return k <= half ? kthGrammar(n - 1, k) : 1 - kthGrammar(n - 1, k - half);
	
    }
}