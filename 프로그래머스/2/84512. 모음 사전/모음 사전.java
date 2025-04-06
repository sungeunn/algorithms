class Solution {
    public int solution(String word) {
        int answer = 0;
        
        String[] vowels = {"A", "E", "I", "O", "U"};
        int[] weights = {781, 156, 31, 6, 1};

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = 0;

            for (int j = 0; j < vowels.length; j++) {
                if (vowels[j].charAt(0) == c) {
                    index = j;
                    break;
                }
            }

            answer += index * weights[i] + 1;
        }
        
        return answer;
    }
}