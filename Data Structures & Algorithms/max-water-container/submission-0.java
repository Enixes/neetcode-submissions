class Solution {
    public int maxArea(int[] heights) {
        int start = 0, end = heights.length - 1;
        int max = 0, curArea = 0;
        while (start < end) {
            curArea = (end - start) * Math.min(heights[start], heights[end]);
            max = Math.max(curArea, max);

            if (heights[start] > heights[end]) {
                end--;
            } else {
                start++;
            }
        }
        return max;
    }
}
