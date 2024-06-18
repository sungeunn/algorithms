class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] chArray = my_string.toCharArray();
        for (char ch : chArray) {
            if (ch >= 65 && ch <= 90) {
                answer += Character.toLowerCase(ch);
            } else {
                answer += Character.toUpperCase(ch);
            }
        }
        
        return answer;
    }
}