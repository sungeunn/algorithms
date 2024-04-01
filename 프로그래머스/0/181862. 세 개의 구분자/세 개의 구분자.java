class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.replaceAll("a|b|c", "a").replaceAll("a+", " ").trim().split(" ");
        
        if (answer[0].isEmpty()) {
            answer[0] = "EMPTY";
        }
        
        return answer;
    }
}