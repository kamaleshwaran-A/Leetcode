class Solution {
    int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    Map<Integer, Integer> map = new HashMap<>();
    int min_move = Integer.MAX_VALUE;
    public int slidingPuzzle(int[][] board) {
        map.put(123450, 0);
        int[] zero = new int[2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    zero[0] = i;
                    zero[1] = j;
                    break;
                }
            }
        }
        helper(board, zero[0], zero[1], 0);
        return min_move == Integer.MAX_VALUE ? -1 : min_move;
    }
    private void helper(int[][] board, int x, int y, int move) {
        if (move > min_move) return;
        int code = encode(board);
        if (code == 123450) {
            min_move = move;
            return;
        }
        if (map.containsKey(code)) {
            if (move > map.get(code)) return;
        }
        map.put(code, move);
        for (int[] dir : dirs) {
            int nx = x + dir[0], ny = y + dir[1];
            if (nx >= 0 && nx < 2 && ny >= 0 && ny < 3) {
                swap(board, x, y, nx, ny);
                helper(board, nx, ny, move + 1);
                swap(board, nx, ny, x, y);
            }
        }
    }
    private void swap (int[][] board, int i, int j, int ii, int jj) {
        int temp = board[i][j];
        board[i][j] = board[ii][jj];
        board[ii][jj] = temp;
    }
    private int encode(int[][] board) {
        int code = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                code *= 10;
                code += board[i][j];
            }
        }
        return code;
    }
}