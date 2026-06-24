class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Deque<Integer> st = new ArrayDeque<>();
        int[] ans = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            while (!st.isEmpty()
                    && temperatures[st.peek()] < temperatures[i]) {

                int idx = st.pop();
                ans[idx] = i - idx;
            }

            st.push(i);
        }

        return ans;
    }
}