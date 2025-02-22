import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Map<Character, Integer> chMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (chMap.containsKey(ch)) {
                answer[i] = i - chMap.get(ch);
            } else {
                answer[i] = -1;
            }
            chMap.put(ch, i);
        }
        
        return answer;
    }
}