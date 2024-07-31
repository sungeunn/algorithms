class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        char[] chArray = my_string.toCharArray();
        for (char ch : chArray) {
            if (ch > 48 && ch < 58) {
                answer += ch - 48;
            }
        }
        
        return answer;
    }
}