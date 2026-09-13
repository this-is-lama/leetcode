class Solution {
    public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			int[] stringHash = new int[10];
			int[] columnHash = new int[10];
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					if (++stringHash[board[i][j] - 48] > 1) {
						return false;
					}
				}
				if (board[j][i] != '.') {
					if (++columnHash[board[j][i] - 48] > 1) {
						return false;
					}
				}
			}
		}
		for (int i = 0; i < 9; i += 3) {
			for (int j = 0; j < 9; j += 3) {
				int[] hash = new int[10];
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						if (board[i + k][j + l] != '.') {
							if (++hash[board[i + k][j + l] - 48] > 1) {
								return false;
							}
						}
					}
				}
			}
		}
		return true;
	}
}