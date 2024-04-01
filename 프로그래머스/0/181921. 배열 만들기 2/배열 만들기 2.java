import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String str = i + "";
            int k = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 48 || str.charAt(j) == 53) {
                    k++;
                }
            }
            if (k == str.length()) {
                answer.add(i);
            }
        }
        
        if (answer.size() == 0) {
            answer.add(-1);
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}