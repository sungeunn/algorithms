import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        Arrays.fill(answer, 0);
        
        for (char ch : my_string.toCharArray()) {
            if (65 <= ch && ch <= 90) {
                answer[ch - 65]++;
            } else {
                answer[ch - 71]++;
            }
        }
        
        return answer;
    }
}