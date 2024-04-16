import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int same = 0;
        int diff = 0;
        
        char target = s.charAt(0);      
        for (int i = 0; i < s.length(); i++) {
            if (target == s.charAt(i)) {
                same++;
            } else {
                diff++;
            }
            
            if (same == diff) {
                answer++;
                if ((i + 1) < s.length()) {
                    target = s.charAt(i+1);
                }
            } else if(i == (s.length() - 1)){
                answer++;
            }
        }
        
        return answer;
    }
}