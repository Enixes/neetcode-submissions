class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;

        while (start < end) {
            int currentSum = numbers[start] + numbers[end];
            if (currentSum > target)
                end--;
            else if (currentSum < target)
                start++;
            else
                return new int[]{start + 1, end + 1};
        }
        return new int[2];
    }
}
