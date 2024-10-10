import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        Set<Character> chSet = new HashSet<>();
        for (char ch : my_string.toCharArray()) {
            if (!chSet.contains(ch)) {
                chSet.add(ch);
                answer += ch;
            }
        }
        
        return answer;
    }
}