class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char curr = board[r][c];

                if (curr == '.') continue;

                int box = (r / 3) * 3 + (c / 3);

                if (rows[r].contains(curr) ||
                    cols[c].contains(curr) ||
                    boxes[box].contains(curr)) {
                    return false;
                }

                rows[r].add(curr);
                cols[c].add(curr);
                boxes[box].add(curr);
            }
        }

        return true;
    }
}