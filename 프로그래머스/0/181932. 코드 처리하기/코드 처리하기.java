class Solution {
    public String solution(String code) {
        String answer = "";
        char[] ch = code.toCharArray();
        int mode = 0;
        
        for (int i = 0 ; i < ch.length; i++) {
            if (mode == 0) {
                if (ch[i] != '1') {
                    if (i % 2 == 0) {
                        answer += ch[i];
                    }
                } else {
                    mode = 1;
                }
            } else {
                if (ch[i] != '1') {
                    if (i % 2 == 1) {
                        answer += ch[i];
                    }
                } else {
                    mode = 0;
                }
            }
        }
        
        return answer.length() == 0 ? "EMPTY" : answer;
    }
}