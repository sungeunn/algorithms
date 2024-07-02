class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strArray = s.split("(?<=\\s)|(?=\\s)");
        for (String str : strArray) {
            if (!str.isBlank()) {
                char[] chArray = str.toCharArray();
                for (int i = 0; i < chArray.length; i++) {
                    if (i % 2 == 0) {
                        answer += Character.toUpperCase(chArray[i]);
                    } else {
                        answer += Character.toLowerCase(chArray[i]);
                    }
                }
            } else {
                answer += str;
            }
        }
        
        
        return answer;
    }
}