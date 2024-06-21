class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] chArray = my_string.toCharArray();
        for (int i = chArray.length - 1; i >= 0; i--) {
            answer += chArray[i];
        }
        
        return answer;
    }
}