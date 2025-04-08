class Solution {
    int solution(int[][] land) {
        int answer = 0;

        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < 4; j++) {
                int maxPrev = 0;

                for (int k = 0; k < 4; k++) {
                    if (k != j) {
                        maxPrev = Math.max(maxPrev, land[i - 1][k]);
                    }
                }

                land[i][j] += maxPrev;
            }
        }

        for (int j = 0; j < 4; j++) {
            answer = Math.max(answer, land[land.length - 1][j]);
        }

        return answer;
    }
}