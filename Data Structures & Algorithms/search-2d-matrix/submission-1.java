class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		int start = 0, end = matrix.length - 1;
		int mid = start + (end - start) / 2;

		while (start <= end) {
			mid = start + (end - start) / 2;
			if (matrix[mid][0] == target) 
				return true;
			else if (matrix[mid][0] < target)
				start = mid + 1;
			else 
				end = mid - 1;
		}

		int row = mid;
		if (matrix[mid][0] > target && mid != 0) 
			row = mid - 1;

		start = 0; end = matrix[0].length - 1;

		mid = start + (end - start) / 2;

		while (start <= end) {
			mid = start + (end - start) / 2;
			if (matrix[row][mid] == target) 
				return true;
			else if (matrix[row][mid] < target)
				start = mid + 1;
			else 
				end = mid - 1;
		}

		return false;
	}

}
