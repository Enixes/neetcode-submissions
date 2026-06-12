class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    st.push(c);
                    break;

                case ')':
                    if (st.isEmpty() || st.pop() != '(')
                        return false;
                    break;

                case ']':
                    if (st.isEmpty() || st.pop() != '[')
                        return false;
                    break;

                case '}':
                    if (st.isEmpty() || st.pop() != '{')
                        return false;
                    break;
            }
        }

        return st.isEmpty();
    }
}