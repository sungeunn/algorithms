class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String str = String.valueOf(order);
        char[] chArray = str.toCharArray();
        for (char ch : chArray) {
            if (ch == '3' || ch == '6' || ch == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}