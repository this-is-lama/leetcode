class RecentCounter {

	private int[] queue;
	private int left;
	private int right;

	public RecentCounter() {
		queue = new int[10000];
		left = 0;
		right = 0;
	}

	public int ping(int t) {
		while (left < right  && queue[left] < t - 3000) {
			left++;
		}
		queue[right++] = t;
		
		return right - left;
	}
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */