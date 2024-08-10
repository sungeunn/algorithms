class Solution {
    public int solution(int n) {
        int answer = 1;
        int num = 1;
        
        while (num <= n) {
            answer++;
            num *= answer;
        }
        
        return answer - 1;
    }
}