import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        
        for (int i = 0; i < my_str.length(); i += n) {
            int length = Math.min(i + n, my_str.length());
            answer.add(my_str.substring(i, length));
        }
        
        return answer.toArray(new String[0]);
    }
}