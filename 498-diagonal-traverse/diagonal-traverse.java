class Solution {
    
    public int[] findDiagonalOrder(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		int[] result = new int[n * m];
		int[] position = new int[] {0, 0, 0};
		while (position[0] <= m && position[1] <= n) {
			up(position, mat, result);
			down(position, mat, result);
		}
		return result;
	}
	public void up (int[] position, int[][] mat, int[] result) {
		int n = mat[0].length;
		int i = position[0];
		int j = position[1];
		while (i >= 0 && j < n) {
			result[position[2]++] = mat[i][j];
			i--;
			j++;
		}
		i++;
		j--;
		if (j == n - 1) {
			i++;
		} else {
			j++;
		}
		position[0] = i;
		position[1] = j;
	}
	public void down (int[] position, int[][] mat, int[] result) {
		int m = mat.length;
		int i = position[0];
		int j = position[1];
		while (i < m && j >= 0) {
			result[position[2]++] = mat[i][j];
			i++;
			j--;
		}
		i--;
		j++;
		if (i == m - 1) {
			j++;
		} else {
			i++;
		}
		position[0] = i;
		position[1] = j;
	}

}