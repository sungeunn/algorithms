import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        List<Character> alpha = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!skip.contains(String.valueOf(c))) {
                alpha.add(c);
            }
        }

        int len = alpha.size();
        for (char c : s.toCharArray()) {
            int pos = alpha.indexOf(c);
            int next = (pos + index) % len;
            answer.append(alpha.get(next));
        }

        return answer.toString();
    }
}