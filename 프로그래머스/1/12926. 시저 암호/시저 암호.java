class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(' ');
                continue;
            }

            if (Character.isUpperCase(c)) {
                answer.append((char) ('A' + (c - 'A' + n) % 26));
            } else {
                answer.append((char) ('a' + (c - 'a' + n) % 26));
            }
        }
        
        return answer.toString();
    }
}