class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[][] dangerZone = new int[n][n];

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    dangerZone[i][j] = 1;

                    for (int d = 0; d < 8; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];

                        if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                            dangerZone[ni][nj] = 1;
                        }
                    }
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dangerZone[i][j] == 0) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}