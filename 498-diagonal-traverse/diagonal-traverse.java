class Solution {
    
    public int[] findDiagonalOrder(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		int[] result = new int[n * m];
		int i = 0;
		int j = 0;
		int index = 0;
		while (i <= m && j <= n) {
			while (i >= 0 && j < n) {
				result[index++] = mat[i][j];
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
			while (i < m && j >= 0) {
				result[index++] = mat[i][j];
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

		}
		return result;
	}
}