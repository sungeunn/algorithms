import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for (int i : num_list) {
            if (i % 2 == 1) {
                odd++;
            } else {
                even++;
            }
        }
        
        List<Integer> answer = new ArrayList<>();
        answer.add(even);
        answer.add(odd);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}