class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        for (int i = 0; i < my_string.length() + 1; i++) {
            String sub = my_string.substring(0, i);
            if (is_prefix.equals(sub)) {
                return 1;
            }
        }
        
        return answer;
    }
}