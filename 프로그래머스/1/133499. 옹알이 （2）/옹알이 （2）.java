class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] strArray = {"aya", "ye", "woo", "ma"};
        for (String b : babbling) {
            String temp = b;
            
            for (String str : strArray) {
                temp = temp.replace(str + str, "X"); 
            }
            
            for (String str : strArray) {
                temp = temp.replace(str, " ");
            }
            
            if (temp.trim().isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}