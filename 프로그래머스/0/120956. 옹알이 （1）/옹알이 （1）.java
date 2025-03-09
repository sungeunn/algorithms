class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] words = {"aya", "ye", "woo", "ma"};
        for (String str : babbling) {
            String temp = str;
            for (String word : words) {
                temp = temp.replace(word, " ");
            }
            if (temp.trim().isEmpty()) {
                answer++;
            }
        }
        
        return answer;        
    }
}