class Solution {
	public int trap(int[] height) {
		Map<Integer, Integer> preMaxHeight = new HashMap<>();
		Map<Integer, Integer> posMaxHeight = new HashMap<>();

		preMaxHeight.put(0, height[0]);
		posMaxHeight.put(height.length - 1, height[height.length - 1]);

		for (int i = 1; i < height.length; i++) {
			preMaxHeight.put(i, Math.max(preMaxHeight.get(i - 1), height[i]));
			int backIndex = height.length - 1 - i;
			posMaxHeight.put(backIndex, Math.max(posMaxHeight.get(backIndex + 1), height[backIndex]));
		}

		int ans = 0;
		for (int i = 1; i < height.length - 1; i++) {
			int trap = Math.min(preMaxHeight.get(i - 1), posMaxHeight.get(i + 1)) - height[i];
			if (trap > 0)
				ans += trap;
		}

		return ans;
	}
}
