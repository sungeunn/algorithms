class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;
        int j = 0;

        if (n % 2 == 1) {
            while (i <= n) {
                if(i % 2 == 1) {
                    answer += i;
                }
                i++;
            }
        } else {
            while (j <= n) {
                if(j % 2 == 0) {
                    answer += j*j;
                }
                j++;
            }
        }

        return answer;
    }
}