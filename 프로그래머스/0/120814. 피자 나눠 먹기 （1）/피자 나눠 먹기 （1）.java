class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i += 7) {
            answer++;
        }
        
        return answer;
    }
}