class Solution {
    public String solution(int age) {
        String answer = "";
        
        String str = String.valueOf(age);
        char[] chArray = str.toCharArray();
        for (char ch : chArray) {
            answer += (char) ('a' + (ch - '0'));
        }
        
        return answer;
    }
}