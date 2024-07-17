class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] chArray = my_string.toCharArray();
        for (char ch : chArray) {
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                answer += ch;
            }
        }
        
        return answer;
    }
}