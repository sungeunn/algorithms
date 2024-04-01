import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i : arr) {
            answer.add(i);
        }
        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                answer.subList(query[i] + 1, answer.size()).clear();
            } else {
                answer.subList(0, query[i]).clear();
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}