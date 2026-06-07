class Solution {
	public int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> lastSeen = new HashMap<>();


		int l = 0;
		int max = 0;

		for (int r = 0; r < s.length(); r++) {
			char c = s.charAt(r);

			if (lastSeen.containsKey(c))
				l = Math.max(l, lastSeen.get(c) + 1);
		

			lastSeen.put(c, r);
			max = Math.max(max, r - l + 1);
		}
		return max;
	}
}
