class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Set<Integer> seen = new HashSet<>();
        int max = 1;

        for (int num : nums) {
            seen.add(num);
        }

        for (int num : seen) {
            if (!seen.contains(num - 1)) {
                int length = 1;
                int current = num;
                while (seen.contains(current + 1)) {
                    length++;
                    current++;
                }

                max = Math.max(length, max);
            }
        }
        return max; 
    }
}
