class Solution {
	public int search(int[] nums, int target) {
		int l = 0; 
		int r = nums.length - 1;

		while (l < r) {
			int mid = (l + r) / 2;

			if (nums[mid] < nums[r])
				r = mid;
			else 
				l = mid + 1;
		}

		int minIndex = l;

		if (target >= nums[minIndex] && target <= nums[nums.length - 1])
			return binarySearch(nums, minIndex, nums.length - 1, target);
		else
			return binarySearch(nums, 0, minIndex - 1, target);
	}

	public int binarySearch(int[] nums, int start, int end, int target) {
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				start = mid + 1;
			else 
				end = mid - 1;
		}
		return -1;
	}
}
