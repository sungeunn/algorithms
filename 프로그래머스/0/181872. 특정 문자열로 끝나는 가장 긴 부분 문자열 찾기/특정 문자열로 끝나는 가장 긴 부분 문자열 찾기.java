class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        char[] ch = myString.toCharArray();
        int patIndex = myString.lastIndexOf(pat) + pat.length() - 1;
        
        for (int i = 0; i <= patIndex; i++) {
            answer += ch[i];
        }
        
        return answer;
    }
}