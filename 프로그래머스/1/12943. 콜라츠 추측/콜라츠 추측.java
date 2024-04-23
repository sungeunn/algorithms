class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        
        while (n != 1) {
            if (n == 1) {
                answer = 0;
                break;
            }
            
            if (answer > 500) {
                answer = -1;
                break;
            }
            
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            answer++;
        }
        
        return answer;
    }
}